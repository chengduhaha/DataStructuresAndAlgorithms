package com.chengdu.zuochengyun;

import java.util.Arrays;
import java.util.List;

import javax.xml.stream.events.EndDocument;

import com.chengdu.util.GenerateRandomArray;
import com.chengdu.util.Swap;

public class BubbleSort {

	public static void main(String[] args) {
		// ��util���е�������鷢���������������
		int[] arr1 = GenerateRandomArray.generateRandomArray(15, 100);
		// ���ԭ����ͳ���
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println("");
		System.out.println("length:" + arr1.length);
		// ð������
		bubble_Sort(arr1);
		// �������������
		System.out.println("ð������");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		// ϵͳ�������
		Arrays.sort(arr1);
		System.out.println("");
		System.out.println("ϵͳ���� ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

	// ð������:ʱ�临�Ӷ�O��n^2���ռ临�Ӷ�O(1)
	public static void bubble_Sort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		for (int end = arr.length - 1; end < arr.length; end--) {
			for (int i = 0; i < end; i++) {
				if (arr[i] > arr[i + 1]) {
					Swap.swap(arr, i, i + 1);// ����util���е�swap��������
				}
			}
		}
	}

}
