package com.chengdu.util;

import org.junit.Test;

//随即数组发生器
public class GenerateRandomArray {
	public static int[] generateRandomArray(int size, int value) {
		int[] arr = new int[(int)((size+1)*Math.random())];//生成长度为size内的随机长度数组
		for(int i = 0; i < arr.length; i++) {
			//数组内每个元素的值都在value内随机
			arr[i] = (int)((value+1)*Math.random()) - (int)((value)*Math.random());
		}
		return arr;
		
	}
	@Test
	public void test() {
		int[] arr1 = generateRandomArray(20, 20);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}		
		System.out.println("");
		System.out.println("length:"+arr1.length);
	}
}

