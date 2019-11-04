package com.bridgelabz.controller;

import java.util.Scanner;

import com.bridgelabz.services.ExtendedDeckQueue;

public class DeckExtended {

		public static void main(String[] args) {
			ExtendedDeckQueue deckofcards = new ExtendedDeckQueue();
			Scanner sc = new Scanner(System.in);
			boolean flag = true;
			while (flag) {
				System.out.println("1:Shuffle cards \n2:Distribute cards \n3: Exit Game");
				System.out.println("Enter the your choice : ");
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					deckofcards.shuffleCards();
					break;
				case 2:
					deckofcards.distributeCards();
					break;
				default:
					flag = false;
				}
			}
		}

	
}
