package com.denominationproject.main;

import java.util.Scanner;

import com.denominationproject.service.CurrencyDenomination;
import com.denominationproject.service.MergeSortImplementation;

public class DriverClass {

	public static void main(String[] args) {

		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		CurrencyDenomination currencyDenomination = new CurrencyDenomination();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the currency denominations value: ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		mergeSortImplementation.mergesort(array, 0, array.length - 1);
		System.out.println("Sorted array is: ");
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
		System.out.println("Enter the amount you want to pay: ");
		int amount = sc.nextInt();

		currencyDenomination.notesCount(array, amount);
	}

}
