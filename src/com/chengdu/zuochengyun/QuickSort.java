package com.chengdu.zuochengyun;

import com.chengdu.util.GenerateRandomArray;
import com.chengdu.util.PrintArr;
import com.chengdu.util.Swap;

/**
 * 快速排序---递归荷兰国旗
 * @author 程都
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] arr = GenerateRandomArray.generateRandomArray(20, 50);
		PrintArr.printArr(arr);
		quickStort(arr, 0, arr.length - 1);
		System.out.println();
		PrintArr.printArr(arr);
	}
	public static void quickStort(int[] arr ,int l , int r) {
		//递归函数一定要有判断！！！否则栈溢出
		if (l < r) {
			int p = arr[(int)(Math.random()*arr.length)];
			int[] a1 = partition(arr, l , r ,p);
			quickStort(arr,l ,a1[0]);
			quickStort(arr,a1[1], r);
		}
		
	}
	public static int[] partition(int[] arr, int l , int r, int p ) {
		int less = l - 1;
		int more = r + 1;
		while(l < more) {
			if (arr[l]<p) {
				Swap.swap(arr, l++, ++less);
			}
			else if (arr[l]>p) {
				Swap.swap(arr, l, --more);
			}
			else {
				l++;
			}
		}
		int[] a1 = {less,more};
		return a1;
	}

}
