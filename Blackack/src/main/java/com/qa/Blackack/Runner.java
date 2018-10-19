package com.qa.Blackack;

public class Runner {

	public static void main(String[] args) {
		BlackJackC b = new BlackJackC();
		b.blackjack(19, 21);
		System.out.println( b.blackjack(19,18));

	}

}
