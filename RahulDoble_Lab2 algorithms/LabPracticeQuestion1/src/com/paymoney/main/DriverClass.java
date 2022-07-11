package com.paymoney.main;

import java.util.Scanner;

import com.paymoney.service.PayMoneyTranscation;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PayMoneyTranscation transcationCheck = new PayMoneyTranscation();
		System.out.println("Enter the size of transaction array: "); // size of the array
		int size = sc.nextInt();
		System.out.println("Enter the values of array "); //take values in array
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("values of array: "); // display array 
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
		System.out.println("Enter the total no of targets that needs to be achieved:"); // no. of iteration perform
		int noOfTarget = sc.nextInt();
		System.out.println("Enter the value of target: "); // find this value with sum
		int target = sc.nextInt();
		// access method in PayMoneyTranscation class
		transcationCheck.payMoneyTranscation(array, noOfTarget, target);
	}
}
