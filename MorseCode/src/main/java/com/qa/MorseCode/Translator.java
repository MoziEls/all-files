package com.qa.MorseCode;

public class Translator {
	
	char[] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
            'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?' };
	String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
          ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
          "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
          "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
          "-----", "--..--", ".-.-.-", "..--.." };
	String output;
	
	public String TranslateEtoM(String a) {
	
		a = a.toLowerCase();
		char[] tempArray = a.toCharArray();
		for(int i = 0; i < tempArray.length; i++) {
			
			for(int j = 0; j < english.length; i++) {
				if(tempArray[i] == english[j]) {
					output += morse[j] + "/";
					return output;
				}
			}
			
			
		}
		
		
		return "";
	}
	
	public String TranslateMtoE(String a) {
		
		
		return "";
	}

}
