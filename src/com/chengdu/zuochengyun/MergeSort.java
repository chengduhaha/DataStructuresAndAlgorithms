package com.chengdu.zuochengyun;

import static org.junit.Assert.assertNotNull;

import com.chengdu.util.GenerateRandomArray;
import com.chengdu.util.PrintArr;

//归并排序
public class MergeSort {

	public static void main(String[] args) {
//		int[] arr1 = GenerateRandomArray.generateRandomArray(15, 55);
		int[] arr1 = new int[] { 1, 2, 6, 5, 9, -5 };
		PrintArr.printArr(arr1);
		System.out.println("\t");
		mergeSort(arr1);
		PrintArr.printArr(arr1);

	}

	public static void mergeSort(int[] arr1) {
		if (arr1 == null || arr1.length < 2) {
			return;
		}
		mergeSort2(arr1, 0, arr1.length - 1);
	}

	// 递归函数
	private static void mergeSort2(int[] arr1, int l, int r) {
		if (l == r) { // base case
			return;
		}
		int mid = l + ((r - l) >> 1);
		mergeSort2(arr1, l, mid);
		mergeSort2(arr1, mid + 1, r);
		merge(arr1, l, mid, r);
	}

	private static void merge(int[] arr1, int l, int mid, int r) {
		int[] help = new int[r - l + 1];
		int i = 0;
		int p1 = l;
		int p2 = mid + 1;
		while (p1 <= mid && p2 <= r) {
			help[i++] = arr1[p1] < arr1[p2] ? arr1[p1++] : arr1[p2++];
		}
		// 越界
		while (p1 <= mid) {
			help[i++] = arr1[p1++];
		}
		while (p2 <= r) {
			help[i++] = arr1[p2++];
		}
		// 将排好序的数组help拷贝归去
		for (int j = 0; j < help.length; j++) {
			arr1[l + j] = help[j];
		}

	}

}
