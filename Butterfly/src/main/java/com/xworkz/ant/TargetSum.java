package com.xworkz.ant;

import java.util.Arrays;

//Program to find index of elements whose sum is equals to the target

public class TargetSum {

	public static void main(String[] args) {

		int[] array = { 2, 7, 4, 5, 9 };
		int target = 9;
		System.out.println("Index of elements of array whose sum is equals to target");
		System.out.println(Arrays.toString(findSum(array, target)));

	}

	public static int[] findSum(int[] array, int target) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return null;

	}

}
