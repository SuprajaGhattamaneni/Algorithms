package LeetCode;

import java.util.Scanner;

public class ReverseInteger {

	public static int reverse(int num) {
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		long reverse = 0;
		if (num > max || num < min)
			return 0;
		else {
			while (num != 0) {
				int modVal = num % 10;
				reverse = (reverse * 10) + modVal;
				// If reverse is exceeding integer range [-2^31, 2^31 - 1] return 0
				// used long value for reverse as it would truncate if used int for larger
				// numbers(ex num - 1534236469, reverse > 2^31-1)
				if (reverse > max)
					return 0;
				else if (reverse < min)
					return 0;
				num = num / 10;
			}
		}
		return (int) reverse;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		System.out.println("Reversed integer " + reverse(n));
		sc.close();
	}
}
