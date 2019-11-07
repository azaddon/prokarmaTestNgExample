package sorting;

public class InsertionSort {
	
	public static void main(String[] args) {
	int [] numbers= {1,5,4,7,8,2,9};
	for(int i=2;i<=numbers.length-1;i++) {
		int key =numbers[i];
		int j=i-1;
		while( j>0 && numbers[j]>key) {
			numbers[j+1]=numbers[j];
			j=j-1;
		}
		numbers[j+1]=key;
	}
	for(int k=0;k<=numbers.length-1;k++)
	System.out.println(numbers[k]);
	}
}
