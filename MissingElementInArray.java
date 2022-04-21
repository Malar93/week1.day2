package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {
	public static void main (String [] args) {
		int n=8;
		int arr[] = {1, 2, 3, 4, 7, 6, 8};
		int sumN= (n*(n+1))/2;
		int sum = 0;
		 
		for (int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		
		int missNum = sumN - sum;
			
				System.out.println("Missing Element in Array : " + missNum);
	
			
	System.out.println("Arrays before Sorting : " + Arrays.toString(arr));
	for (int i=0; i< arr.length-1; i++) {
		for (int j=i+1; j< arr.length; j++) {
		if (arr[i]>arr[j])
		{
			int temA= arr[i];
			arr[i]= arr[j];
			arr[j]=temA;
		}
		}
	}
	System.out.println ("Arrays after Sorting : " + Arrays.toString(arr));
	Arrays.toString(arr);
	}
	
}
		
	
