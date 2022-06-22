package javaProgram;
import java.util.*;
class stack{
	int top,max;
	int arr[];
	//constructor
	stack(int n){
		max = n;
		arr = new int[max];
		top = -1;
	}
	//push method
	void push(int i) {
		if(top==max-1) {
			System.out.println("Overflow Condition");
		}
		else {
			top++;
			arr[top] = i;
		}
	}
	//pop method
	void pop() {
		int item=0;
		if(top==-1) {
			System.out.println("Underflow Condition");
			return;
		}
		else {
			item = arr[top];
			top--;
		}
		System.out.println("Deleted element: "+item);
	}
	//display method
	void display() {
		if(top==-1)
		System.out.println("stack is empty");
		else {
			System.out.println("stack elements are: ");
			for(int i=top;i>=0;i--) {
				System.out.println(arr[i]);
			}
		}
	}
}
public class one1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of integer stack : ");
		int n = sc.nextInt();
		stack s = new stack(n);
		boolean done = false;
		while(!done) {
			System.out.println("Enter Choice: \n1.push\t2.pop\t3.display\t4.exit");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: System.out.println("Enter the integer value: ");
			 			int i=sc.nextInt();
			 			s.push(i);
			 			break;
			case 2: s.pop();
						break;
			case 3: s.display();
						break;
			case 4: done = true;
			}
		}
		
	}
}



















