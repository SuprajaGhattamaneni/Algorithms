package SortingAlgos;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of digits");
		int n = sc.nextInt();
		int temp;
		int key;
		int arr[] = new int[100];
		System.out.println("Enter the digits to perform sort");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 1; i < n; i++) {
			{
				key = arr[i];
				while (i > 0 && key < arr[i - 1]) {
					temp = arr[i - 1];
					arr[i - 1] = key;
					arr[i] = temp;
					i--;
				}
				//arr[i] = key;
			}
		}

		System.out.println("Array after insertion sort");
		System.out.print("{ " );
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("}" );
		sc.close();
	}

}
