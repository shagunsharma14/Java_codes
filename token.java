package javaProgram;
import java.util.StringTokenizer;

public class token {
	public static void main(String[] args) {
		String str="pruthvi/dept of/cse  sdmit ujire";
		StringTokenizer st = new StringTokenizer(str,"/,");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
