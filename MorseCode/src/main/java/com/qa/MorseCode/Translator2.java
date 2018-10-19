package com.qa.MorseCode;

import java.util.HashMap;

public class Translator2 {
	
	static HashMap<String, String> english = new HashMap<String, String>();
	static HashMap<String, String> morse = new HashMap<String, String>();
	char[] charArray;
	
	String output;
	
	static {
	    english.put("a", ".-");
	    english.put("b", "-...");
	    english.put("c", "-.-.");
	    english.put("d", "-..");
	    english.put("e", ".");
	    english.put("f", "..-.");
	    english.put("g", "--.");
	    english.put("h", "....");
	    english.put("i", "..");
	    english.put("j", ".---");
	    english.put("k", "-.-");
	    english.put("l", ".-..");
	    english.put("m", "--");
	    english.put("n", "-.");
	    english.put("o", "---");
	    english.put("p", ".--.");
	    english.put("q", "--.-");
	    english.put("r", ".-.");
	    english.put("s", "...");
	    english.put("t", "-");
	    english.put("u", "..-");
	    english.put("v", "...-");
	    english.put("w", ".--");
	    english.put("x", "-..-");
	    english.put("y", "-.--");
	    english.put("z", "--..");
	    english.put(" ", "/");

	    morse.put(".-", "a");
	    morse.put("-...", "b");
	    morse.put("-.-.", "c");
	    morse.put("-..", "d");
	    morse.put(".", "e");
	    morse.put("..-.", "f");
	    morse.put("--.", "g");
	    morse.put("....", "h");
	    morse.put("..", "i");
	    morse.put(".---", "j");
	    morse.put("-.-", "k");
	    morse.put(".-..", "l");
	    morse.put("--", "m");
	    morse.put("-.", "n");
	    morse.put("---", "o");
	    morse.put(".--.", "p");
	    morse.put("--.-", "q");
	    morse.put(".-.", "r");
	    morse.put("...", "s");
	    morse.put("-", "t");
	    morse.put("..-", "u");
	    morse.put("...-", "v");
	    morse.put(".--", "w");
	    morse.put("-..-", "x-");
	    morse.put("-.--", "y");
	    morse.put("--..", "z");
	    morse.put(" ", "/");
	}
	

	public String englishToMorse(String a) {
		
		
		return "";
	}
	
	public String morseToEnglish(String a) {
		
		for(int i = 0; i < a.length(); i++) {
			charArray = a.toCharArray();
			if(charArray[i] == '/') {
				char[] temp = a.substring(a.charAt(i) - i, i).toCharArray();
				for(char b : temp) {
					
				}

			}
			output = output + morse.get(a);
			
			return output;
			
		}
		
		return "";
	}
	
}
