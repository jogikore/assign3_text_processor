package com.epam.strings.main;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		System.out.println("***Text Processor to keep ONLY letters and remove other characters in a given line of text***");
		System.out.println("Please enter a line of text : ");
		Scanner scanner = new Scanner(System.in);
		String itext = scanner.nextLine();
		
		if (TextProcessor.isEmpty(itext))
			System.out.println("Please enter non-empty text line");
		else
			System.out.println("Output line of text : " + TextProcessor.removeSpecialLetters1(itext));
			//System.out.println("Output line of text : " + TextProcessor.removeSpecialLetters2(itext));
	}

}
