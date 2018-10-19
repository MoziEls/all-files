package com.qa.Blackack;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class blackJackTest {
	@Test
	public void test() {
		BlackJackC b = new BlackJackC();
		 assertEquals(10, b.blackjack(10,8));
	}

}
