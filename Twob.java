//Write a Java class called Customer to store their name and
//date_of_birth.The date_of_birth format should be dd/mm/yyyy.
//Write methods to read customer data as <name,dd/mm/yyyy>
//and dispay as <name,dd,mm,yyyy>
//using StringTokenizer class considering the delimiter as
package javaProgram;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Twob {
	String name;
	String date;
	Scanner sc= new Scanner(System.in);
	void read(){
		System.out.println("Enter the customer name");
		name = sc.nextLine();
		System.out.println("Enter the date of birth as dd/mm/yy format");
		date=sc.next();
	}
	void display() {
		StringTokenizer st= new StringTokenizer(date,"/");
		System.out.print(name);
		//st.hasMoreTokens to check for the tokens available in the string
		//token<-- pieces of string 
		while(st.hasMoreTokens()) {
			System.out.print(","+st.nextToken());	//to print the token
		}
	}
	public static void main(String[] args) {
		Twob b = new Twob();
		b.read();
		b.display();
	}
}















