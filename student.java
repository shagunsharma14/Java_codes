package javaProgram;
import java.util.*;
public class student {
	String usn;
	String name;
	String branch;
	String phone;
	Scanner sc = new Scanner(System.in);
	public void read() {
		
		System.out.println("Enter usn: ");
		usn = sc.nextLine();
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("Enter branch: ");
		branch = sc.nextLine();
		System.out.println("Enter phone: ");
		phone = sc.nextLine();
	}
	public void display() {
		System.out.println("name: "+name+"   usn: "+usn+"  branch:  "+branch+"  phone:  "+phone);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		student s[] = new student[10];
		
		System.out.println("Enter number of students: ");
		int n = sc.nextInt();
		
		System.out.println("Enter student details: ");
		
		for(int i=0;i<n;i++) {
			s[i] = new student();
			System.out.println();
			s[i].read();
		}
		
		System.out.println("Student details are: ");
		for(int j=0;j<n;j++) {
			s[j].display();
		}
		
	}
	
}
