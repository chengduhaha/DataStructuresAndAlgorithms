package com.chengdu.zuochengyun;

import java.util.Arrays;
import java.util.List;

import javax.xml.stream.events.EndDocument;

import com.chengdu.util.GenerateRandomArray;
import com.chengdu.util.Swap;

public class BubbleSort {

	public static void main(String[] args) {
		// 用util包中的随机数组发生器生乘随机数组
		int[] arr1 = GenerateRandomArray.generateRandomArray(15, 100);
		// 输出原数组和长度
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println("");
		System.out.println("length:" + arr1.length);
		// 冒泡排序
		bubble_Sort(arr1);
		// 输出排序后的数组
		System.out.println("冒泡排序：");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		// 系统排序并输出
		Arrays.sort(arr1);
		System.out.println("");
		System.out.println("系统排序： ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

	// 冒泡排序:时间复杂都O（n^2）空间复杂度O(1)
	public static void bubble_Sort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		for (int end = arr.length - 1; end < arr.length; end--) {
			for (int i = 0; i < end; i++) {
				if (arr[i] > arr[i + 1]) {
					Swap.swap(arr, i, i + 1);// 调入util包中的swap互换方法
				}
			}
		}
	}

}
