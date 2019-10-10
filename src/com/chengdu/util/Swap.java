package com.chengdu.util;

import org.junit.Test;

public class Swap {
	//当i==j时用temp方法，否则按位异或运算互换位置
	public static void swap(int[] arr, int i, int j) {
		if (i != j) {
			arr[i] = arr[i] ^ arr[j];
			arr[j] = arr[i] ^ arr[j];
			arr[i] = arr[i] ^ arr[j];
			
		}
		else {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	@Test
	public void test() {
		int[] arr = {14,4};
		swap(arr, 0, 1);
		PrintArr.printArr(arr);
		
	}
}
	
