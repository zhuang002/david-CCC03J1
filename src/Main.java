import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int s = sc.nextInt();
		int h = sc.nextInt();
		
		printTile(t,s);
		printConnector(s);
		printHandle(s,h);

	}

	

	private static void printHandle(int s, int h) {
		String line = "";
		for (int i=0;i<s+1;i++) {
			line += " ";
		}
		line +="*";
		
		for (int i=0;i<h;i++) {
			System.out.println(line);
		}
		
	}



	private static void printConnector(int s) {
		int width = 3+s*(2);
		for (int i=0;i<width;i++) {
			System.out.print("*");
		}
		System.out.println();
		
	}



	private static void printTile(int t, int s) {
		String line  = "*";
		
		for (int i=0;i<2;i++) {
			for (int j=0;j<s;j++) {
				line += " ";
			}
			line+="*";
		}
		for (int i=0;i<t;i++) {
			System.out.println(line);
		}
	}

}
