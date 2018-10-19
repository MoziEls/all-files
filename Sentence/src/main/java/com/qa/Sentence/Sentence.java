package com.qa.Sentence;

public class Sentence {

	public String sentence;
	String space;
	String finalString;

	public String split(String ss) {
		this.sentence = ss;
		char[] tempArray = sentence.toCharArray();

		for (int i = tempArray.length; i > 0; i--) {

			if (tempArray[i - 1] == ' ') {
				if (tempArray[i] == tempArray[i - 2]) {

					String newSentence = remove(i, sentence);
					newSentence = remove(i - 1, newSentence);
					finalString = newSentence;

					return finalString;

				} else {
					continue;  
				}

			}

		}

		return "    nnunhu";

	}

	public static String remove(int postion, String stringName) {
		char[] charArray = stringName.toCharArray();
		char[] resultArray = new char[charArray.length];
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (i != postion - 1) {
				resultArray[count] = charArray[i];
				count++;
			}
		}
		return String.valueOf(resultArray);
	}

}
