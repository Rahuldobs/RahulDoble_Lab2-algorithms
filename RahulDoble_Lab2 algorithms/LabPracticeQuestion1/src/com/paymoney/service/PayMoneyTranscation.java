package com.paymoney.service;

public class PayMoneyTranscation {

	public void payMoneyTranscation(int arr[], int noOfTarget, int target) {
		int sum = 0; // initial value
		for (int i = 0; i < noOfTarget; i++) {
			sum = sum + arr[i];

			if (sum >= target) {
				System.out.println("Target achieved after " + (i + 1) + " transactions ");
				break;
			}
		}
		if (sum < target) {
			System.out.println("Given target is not achieved");
		}
	}
}
