package javaProgram;
import java.util.*;

class arrystack{
	int stack[ ];
	int top,max;
	//constructor to initilise 
	  arrystack(int n) {
		max =n;
		stack = new int[max];
		top=-1;
	}
	
	void push(int i) {
		if(top==max-1) {
			System.out.println("Overflow");
		}
		else {
			top++;
			stack[top] =i;
		}
	}
	
	void pop() {
		int item =0;
		if(top==-1) {
			System.out.println("Underflow");
		}
		else {
			 item=stack[top];
			top--;
		}
		System.out.println("Deleted: "+item);
	}
	
	void display() {
		if(top==-1) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Stack elements are: ");
			for(int i=top;i>=0;i--) {
				System.out.println(stack[i]+" ");
			}System.out.println();
		}
	}
}

public class Stack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the integer stack: ");
		int n=sc.nextInt();
		arrystack s = new arrystack(n);
		boolean done = false;
		while(!done) {
			System.out.println("Enter choice\n1.push\t2.pop\t3.display\t4.exit");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: System.out.println("Enter the value: ");
						int i = sc.nextInt();
						s.push(i);
						break;
			case 2: s.pop();break;
			case 3: s.display();break;
			case 4: done=true;break;
			default: System.out.println("Invalid Input");
			
			}
		}
	}
}






