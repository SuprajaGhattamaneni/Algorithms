package LeetCode;

import java.util.Scanner;

public class ShiftingLetters {

	public static void shiftingLetters(String s, int[] shifts) {	         
	        int previous = 0;
	        for(int i=shifts.length-1; i>=0; i--){            
	            shifts[i] = (shifts[i] + previous) % 26;
	            previous = shifts[i];
	        }
	         
	        char[] chars = s.toCharArray();
	        for(int i=0; i<chars.length; i++){
	            chars[i] = (char)('a' + (((int)chars[i] + shifts[i]) % 'a') % 26);
	        }

		System.out.print("Output String " + String.valueOf(chars));
	}

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("Enter shift numbers");
		int[] arr = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			arr[i] = sc.nextInt();
		}
		shiftingLetters(s, arr);
		sc.close();
	}

}
