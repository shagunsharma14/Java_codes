package javaProgram;
import java.util.*;
class student1{
	String usn,name,phno,branch;
	Scanner sc = new Scanner(System.in);
	public void read() {
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("Enter usn: ");
		usn = sc.nextLine();
		System.out.println("Enter phno: ");
		phno = sc.nextLine();
		System.out.println("Enter branch: ");
		branch = sc.nextLine();
	}
	public void display() {
		
		System.out.println("name: "+name);
		System.out.println("usn: "+usn);
		System.out.println("phno: "+phno);
		System.out.println("branch: "+branch);
		System.out.println();
		System.out.println();
	}
}
public class deleteit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		student1 a[] = new student1[10];
		System.out.println("Enter the number of student: ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Enter student detail: ");
			a[i] = new student1();
			a[i].read();
			System.out.println();
			System.out.println();
		}
		
		
		for(int j=0;j<n;j++) {
			System.out.println("Student details are: ");
			a[j].display();
		}
	}

}
