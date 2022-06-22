package javaProgram;
import java.util.*;
public class binarySearch {
	//sorting the array elements before performing  binary search "Bubble Sort"
	static	int [] bubbleSort(int [] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
				int temp=a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}return a;
	}
	//performing "Binary Search"
	static int search(int []a,int n,int key) {
		int l=1,h=n;
		while(l<=h) {
			int mid=(l+h)/2;
			if(key==a[mid])
				return mid;
			if(key<a[mid]) 
				h=mid-1;
			else 
				l=mid+1;
		}
		return 0;
	}
	
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	//asking for size of array
	System.out.println("Enter the size of the array: ");
	int n=sc.nextInt();
	
	//taking array elements as input
	int a[] = new int[n];
	System.out.println("Enter the array elements: ");
	for(int i=0;i<a.length;i++) {
		a[i] = sc.nextInt();
	}
	
	//applying sorting on a and then storing the sorted array in b
	int [] b=bubbleSort(a);
	
	//DELETE
	System.out.println("Sorted elements: ");
	for(int i=0;i<b.length;i++) {
		System.out.print(b[i]+" ");
	}
	System.out.println();
	//DELETE
	//asking for the "KEY"
	System.out.println("Enter the key to search: ");
	int key =sc.nextInt();
	
	//searching for the  key and storing the result in the x 
	int x= search(b,n,key);
	
	//printing the index on which we get the key
	if (x==0) {
		System.out.println("Key Not Found");
	}
	else {
		System.out.println("Key Found at index: "+x);
	}
	}
}

