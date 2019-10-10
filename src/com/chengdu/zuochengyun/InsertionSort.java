package com.chengdu.zuochengyun;

import com.chengdu.util.GenerateRandomArray;
import com.chengdu.util.PrintArr;
import com.chengdu.util.Swap;

//插入排序
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr1 = GenerateRandomArray.generateRandomArray(10, 50);
		// 排序前数组
		PrintArr.printArr(arr1);
		System.out.println("");
		System.out.println("--------------------------");
		// 插入排序后数组
		int[] arr2 = insertionSort(arr1);
		PrintArr.printArr(arr2);

	}

	// 插入排序：时间复杂都O（n^2）额外空间复杂度O(1)
	public static int[] insertionSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return arr;
		}
		for (int i = 1; i < arr.length; i++) {
			for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
				Swap.swap(arr, j, j + 1);
			}
		}
//		for ( int i = 1 ; i <= arr.length-1; i ++){
//			for ( int j = i -1 ; j >= 0 ;j-- ){
//				if (arr[j]>arr[j+1]){
//					Swap.swap(arr,j,j+1);
//				}
//			}
//		}
		return arr;

	}
}
