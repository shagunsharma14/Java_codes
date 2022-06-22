package javaProgram;
import java.util.*;
class staff{
	String id,name,phone;
	double salary;
	Scanner sc = new Scanner(System.in);
	//read method
	public void read() {
		System.out.println("Enter staff id: ");
		id = sc.next();
		System.out.println("Enter staff name: ");
		name = sc.next();
		System.out.println("Enter staff phone number: ");
		phone = sc.next();
		System.out.println("Enter staff salary: ");
		salary = sc.nextDouble();
	}
	//display method
	void display() {
		System.out.print(id+"\t"+name+"\t"+phone+"\t"+salary+"\t");
	}
	
}
class Teaching extends staff{
	String domain;
	int publication;
	//read method
	public void read() {
		//calling the super class read function
		super.read();
		System.out.println("Enter Domain: ");
		domain = sc.next();
		System.out.println("Enter publication: ");
		publication = sc.nextInt();
	}
	public void display() {
		//calling super class function
		super.display();
		System.out.println(domain+"\t"+publication+"\t");
	}
}

class Technical extends staff{
	String skills;
	//read method
	public void read() {
		super.read();
		System.out.println("Enter Skills: ");
		skills  = sc.next();
	}
	//display method
	public void display() {
		super.display();
		System.out.println(skills+"\t");
	}
}

class Contract extends staff{
	String period;
	public void read() {
		super.read();
		System.out.println("Enter period: ");
		period = sc.next();
	}
	public void display() {
		super.display();
		System.out.println(period+"\t");
	}
}
public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of staff: ");
		int n = sc.nextInt();
		Teaching steaching[] = new Teaching[n];
		Technical stechnical[] = new Technical[n];
		Contract scontract[] = new Contract[n];
		System.out.println("Enter the teaching staff details: ");
		for(int i=0;i<n;i++) {
			steaching[i] = new Teaching();
			steaching[i].read();
		}
		System.out.println("Enter the technical staff details: ");
		for (int i=0;i<n;i++) {
			stechnical[i] = new Technical();
			stechnical[i].read();
		}
		System.out.println("Enter the contract details: ");
		for(int i=0;i<n;i++) {
			scontract[i] = new Contract();
			scontract[i].read();
		}
		System.out.println("Teaching staff details are: ");
		for(int i=0;i<n;i++) {steaching[i].display();}
		System.out.println("Technical staff details are: ");
		for(int i=0;i<n;i++) {stechnical[i].display();}
		System.out.println("Contract staff details are: ");
		for(int i=0;i<n;i++) {scontract[i].display();}	
	}
}
