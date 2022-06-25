//Multithreading Practice (Thread class and Runnable)

//Multithreasing using Thread class
package finishasap;
//class Mythread extends Thread{
	
	//public void run() {
		//int i=1;
		//while(true) {
			
			//System.out.println(i+" "+"  Hello");i++;
		//}
	//}
//}
class MyThread extends Thread{
	public MyThread(String name){
		super(name);
	}
	public void run() {
		int count=0;
		while(true) {
			System.out.println(count++);
			try {
				Thread.sleep(500);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
public class Test {
	public static void main(String[] args) {
		MyThread t = new MyThread("mythread");
		System.out.println("ID: "+t.getId());
		System.out.println("Name: "+t.getName());
		System.out.println("Priority "+t.getPriority());
		t.start();
		t.interrupt();
		System.out.println("State: "+t.getState());
		System.out.println("Alive?: "+t.isAlive());
		
		}
	}

//Multithreading using Runnable
/*class myRunnable implements Runnable{
	public void run() {
		int i=1;
		while(true) {
			System.out.println(i+" "+" Hello");i++;
		}
	}
}
*/
