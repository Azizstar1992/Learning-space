package project1;

import java.util.Arrays;

public class ReverseString {
	static String reverse(String input) {
		int end = input.length()-1;
		char[] inputArray = input.toCharArray();
		for(int i = 0 ; i < inputArray.length/2;i++) {
			char temp = inputArray[i];
			inputArray[i] = inputArray[end];
			inputArray[end] = temp;
			end--;
		}
		String solution = new String(inputArray);
		return solution;
		
	}

}
