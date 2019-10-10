package com.chengdu.zuochengyun;

import com.chengdu.util.GenerateRandomArray;
import com.chengdu.util.PrintArr;

public class QiuXiaoHe {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 10, 2, 6, 5, 9 };
//		int[] arr = GenerateRandomArray.generateRandomArray(10, 50);
		PrintArr.printArr(arr1);

		System.out.println();
		System.out.println(qiuXiaoHe(arr1));

	}

	public static int qiuXiaoHe(int[] arr) {
		if (arr == null && arr.length < 2) {
			return 0;
		}
		return merge(arr, 0, arr.length - 1);
	}

	private static int merge(int[] arr, int l, int r) {
		if (l == r) {
			return 0;
		}
		int mid = l + ((r - l) >> 1);
		return merge(arr, l, mid) + merge(arr, mid + 1, r) + merge2(arr, l, mid, r);
	}

	private static int merge2(int[] arr, int l, int mid, int r) {
		int[] help = new int[r - l + 1];
		int i = 0;
		int p1 = l;
		int p2 = mid + 1;
		int sum = 0;
		while (p1 <= mid && p2 <= r) {
			sum += arr[p1] < arr[p2] ? arr[p1] * (r - p2 + 1) : 0;
			help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
		}
		while (p1 <= mid) {
			help[i++] = arr[p1++];
		}
		while (p2 <= r) {
			help[i++] = arr[p2++];
		}
		for (int j = 0; j < help.length; j++) {
			arr[l + j] = help[j];
		}
		return sum;
	}

}
