package com.epam.strings.main;

public class TextProcessor {
	
	private static final String regex = "[^a-zA-Z]";
	private static final char[] LETTERS = new char[]{'a', 'b','c','d','e','f', 'g', 'h','i',
			'j','k','l','m','n','o','p','q','r','s', 't','u','v','w','x','y','z', 
			'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T',
			'U','V','X','Y','Z',' '};
	private static final char SPACE = ' '; 
	
	public static boolean isEmpty(String itext){
		return (itext==null || itext.trim().equals(""));
	}
	
	public static String removeSpecialLetters1(String itext){
		return itext.replaceAll(regex, " ");
	}
	
	public static String removeSpecialLetters2(String itext){
		StringBuilder sb = new StringBuilder(itext.length());
		
		char[] iatext = itext.toCharArray();
		boolean found = false; 
		
		for (int ic=0; ic<iatext.length; ic++){
			for(int c=0; c< LETTERS.length; c++){
				if(iatext[ic] == LETTERS[c])
					found = true; 				
			}			
			if(found)
				sb.append(iatext[ic]);
			else
				sb.append(SPACE);
			
			found = false; 		
		}
		return sb.toString();
	}

}
