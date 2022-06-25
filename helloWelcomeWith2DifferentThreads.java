package finishasap;
class MyThread{
	
	public void display(String  str) {
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
	}
}

class Thread1 extends Thread{
	MyThread d;
	public Thread1(MyThread d) {
		this.d = d;
	}
	public void run() {
		d.display("HelloWorld");
	}
}

class Thread2 extends Thread{
	MyThread data;
	public Thread2(MyThread data) {
		this.data = data;
	}
	public void run() {
		data.display(" WelcomeBhai");
	}
}

public class helloWelcomeWith2DifferentThreads {
	public static void main(String[] args) {
	MyThread th = new MyThread();
	Thread1 t1  = new Thread1(th);
	Thread2 t2 = new Thread2(th);
	t1.start();
	t2.start();
}
}
