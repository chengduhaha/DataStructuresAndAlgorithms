package com.chengdu.zuochengyun;

import com.chengdu.util.PrintArr;
import com.chengdu.util.Swap;

/**
 * 荷兰国旗问题
 * 
 * @author 程都
 *
 */
public class NetherlandsFlag {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 9, 7, 6, 1, 4, 6, 10 };
		int p = 7;

		PrintArr.printArr(partition(arr, 0, arr.length - 1, p));
	}

	public static int[] partition(int[] arr, int l, int r, int p) {
		int less = l - 1;
		int more = r + 1;
		while (l < more) {
			if (arr[l] < p) {
				Swap.swap(arr, l++, ++less);
			} else if (arr[l] > p) {
				Swap.swap(arr, l, --more);
			} else {
				l++;
			}
		}
		return arr;
	}
}
