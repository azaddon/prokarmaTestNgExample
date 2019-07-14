package sorting;

import java.util.Scanner;

public class SimpleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Element to be sorted");
		int n =sc.nextInt();
		int[] number =new int[n];
		System.out.println("Enter Elements to be sorted");
		for(int i=0;i<n;i++) {	
			number[i]=sc.nextInt();
		}
		for(int k=0;k<number.length;k++) {
			for(int l=k+1;l<number.length;l++) {
				if(number[k]>number[l]) {
					int temp=number[k];
					number[k]=number[l];
					number[l]=temp;
				}
			}
		}
for(int i=0;i<n;i++) {
	System.out.println(number[i]);
}
	}

}
