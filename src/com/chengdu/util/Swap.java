package com.chengdu.util;

import org.junit.Test;

public class Swap {
	//��i==jʱ��temp����������λ������㻥��λ��
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
	
