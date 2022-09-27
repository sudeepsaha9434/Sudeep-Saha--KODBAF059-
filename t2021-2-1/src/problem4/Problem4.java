package problem4;

import java.util.Scanner;
public class Problem4 {

	static void printMul(int [] arr) {
		int []numbers= {1,2,3,4,5,6,7,8,9};
		int counter=0;
		for(int i=0;i<=numbers.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				if(arr[j]%numbers[i]==0) {
					counter++;
				}
			}
			System.out.print(numbers[i]+":"+counter+" ");
			counter=0;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array Size :");
		int arr[]=new int [scan.nextInt()];
		System.out.println("Enter the elements:");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Input:");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Output:");
		printMul(arr);
		scan.close();
	}

}
