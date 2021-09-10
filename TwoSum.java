package LeetCode;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> numVals = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int c = target - nums[i];
			if (numVals.containsKey(c)) {
				int[] returnArr = { numVals.get(c), i };
				return returnArr;
			}
			numVals.put(nums[i], i);
		}
		return null;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of digits in array");
		int arrLen = sc.nextInt();
		System.out.println("Enter element in an array");
		int[] nums = new int[arrLen];
		for (int i = 0; i < arrLen; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println("Enter the target");
		int target = sc.nextInt();
		int[] output = twoSum(nums, target);
		System.out.println("[" + output[0] + ", " + output[1] + "]");
		sc.close();
	}

}
