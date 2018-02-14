package com.practice;


public class StringManipulation {
	static final int ASCII_SIZE = 256;
	
	static char getMaxOccuringChar(String str) {
		
		int[] count = new int[ASCII_SIZE];
		
		int len = str.length();
		
		for(int idx_i = 0 ; idx_i < len ; idx_i++) {
			count[str.charAt(idx_i)] = count[str.charAt(idx_i)]+1;
			System.out.println(count[str.charAt(idx_i)]);
		}
		
		int max = -1;
		
		char result = ' ';
		
		for(int idx_j = 0 ; idx_j < len ; idx_j++) {
			if(max < count[str.charAt(idx_j)]) {
				max =  count[str.charAt(idx_j)];
				result = str.charAt(idx_j);
				
			}
			
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = StringManipulation.getMaxOccuringChar("aaaattwrewetwegddddd");
		System.out.println(c);
	}

}
