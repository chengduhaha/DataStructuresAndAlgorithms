package com.chengdu.util;

import org.junit.Test;

//�漴���鷢����
public class GenerateRandomArray {
	public static int[] generateRandomArray(int size, int value) {
		int[] arr = new int[(int)((size+1)*Math.random())];//���ɳ���Ϊsize�ڵ������������
		for(int i = 0; i < arr.length; i++) {
			//������ÿ��Ԫ�ص�ֵ����value�����
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

