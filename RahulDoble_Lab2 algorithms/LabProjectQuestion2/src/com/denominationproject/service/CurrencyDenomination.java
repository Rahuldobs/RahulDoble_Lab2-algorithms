package com.denominationproject.service;

public class CurrencyDenomination {

	public void notesCount(int notes[], int amount) {
		int[] notesCounter = new int[notes.length];

		for (int i = 0; i < notes.length; i++) {

			if (amount >= notes[i]) {
				notesCounter[i] = amount / notes[i];
				amount = amount - notesCounter[i] * notes[i];
			}
		}
		if (amount > 0) {
			System.out.println("Amount cannot be given in highest denomination");
		} else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for (int i = 0; i < notes.length; i++) {
				if (notesCounter[i] != 0) {
					System.out.println(notes[i] + " : " + notesCounter[i]);
				}
			}
		}
	}
}
