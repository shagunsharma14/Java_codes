package javaProgram;
import  java.util.Scanner;
public class Assignment2 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a[] = {1,2,3,4,5,6,7,8,9};
			int counteven=0;
			int countodd=0;
			//for even numbers
			System.out.println("Even Numbers are: ");
			for(int i =0;i<a.length;i++) {
				if(a[i]%2==0) {
					System.out.println(a[i]);
					counteven++;
				}
			}
			//for odd numbers
			System.out.println("Odd Numbers are: ");
			for(int i =0;i<a.length;i++) {
				if(a[i]%2!=0) {
				System.out.println(a[i]);
				countodd++;
				}
		}
			System.out.println("Number of even numbers are: "+counteven);
			System.out.println("Number of odd numbers are: "+countodd);
		}
}



