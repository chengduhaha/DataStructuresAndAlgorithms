package com.chengdu.zuochengyun;

import com.chengdu.util.GenerateRandomArray;
import com.chengdu.util.PrintArr;
import com.chengdu.util.Swap;

/**
 * ��������---�ݹ��������
 * @author �̶�
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
		//�ݹ麯��һ��Ҫ���жϣ���������ջ���
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
