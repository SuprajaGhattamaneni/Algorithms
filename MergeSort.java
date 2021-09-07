package SortingAlgos;

import java.util.Scanner;

public class MergeSort {

	private static void mergeSort(int[] arr, int n) {
		int mid = n / 2;
		int arr1[] = new int[mid];
		int arr2[] = new int[n - mid];

		// for single element, no need of sort
		if (n < 2)
			return;

		// dividing the array into 2 halves using mid
		for (int i = 0; i < mid; i++) {
			arr1[i] = arr[i];
		}

		for (int i = mid; i < n; i++) {
			arr2[i - mid] = arr[i];
		}
		// running through recursive loop until all elements are divided in an array
		mergeSort(arr1, mid);
		mergeSort(arr2, n - mid);
		// merge divided arrays
		merge(arr, arr1, arr2);
	}

	private static void merge(int[] arr, int[] left, int[] right) {
		int n1 = left.length;
		int n2 = right.length;
		int i = 0, j = 0, k = 0;

		// check the smallest digit in both left && right to place it in final array
		while (i < n1 && j < n2) {
			if (left[i] < right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}

		// for remaining digits in left and right which are unsorted
		while (i < n1) {
			arr[k] = left[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}

	private static void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of digits");
		int n = sc.nextInt();
		int arr[] = new int[100];

		System.out.println("Enter digits to sort");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		mergeSort(arr, n);
		System.out.println("Sorted array ");
		printArray(arr, n);
		sc.close();
	}

}
