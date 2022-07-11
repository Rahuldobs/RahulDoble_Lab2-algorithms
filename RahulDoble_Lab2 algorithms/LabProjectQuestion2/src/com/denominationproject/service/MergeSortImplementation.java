package com.denominationproject.service;

public class MergeSortImplementation {

	public void mergesort(int arr[], int left, int right) {

		if (left < right) {
			int mid = (left + right) / 2;
			mergesort(arr, left, mid);
			mergesort(arr, mid + 1, right);
			mergeSorting(arr, left, mid, right);
		}
	}

	private void mergeSorting(int[] arr, int left, int mid, int right) {
		// TODO Auto-generated method stub
		int len1 = mid - left + 1;
		int len2 = right - mid;
		int leftArray[] = new int[len1];
		int rightArray[] = new int[len2];
		for (int i = 0; i < len1; i++) {
			leftArray[i] = arr[left + i];
		}
		for (int j = 0; j < len2; j++) {
			rightArray[j] = arr[mid + 1 + j];
		}
		int i = 0;
		int j = 0;
		int k = left;
		while (i < len1 && j < len2) {
			if (leftArray[i] >= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		while (i < len1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		while (j < len2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}
}
