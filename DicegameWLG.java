import java.util.Random;
import java.util.Scanner;
public class DicegameWLG{
	public static void main(String[] args) {
		System.out.println("What is your name?");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("Hello, "+name+"!");
		Random r = new Random();
		int v[] = new int[2];
		System.out.println("Rolling the dice...");
		for(int i=0;i<2;i++) {
			v[i]=r.nextInt(6)+1;
			System.out.println("Die "+(i+1)+": "+v[i]);
		}
		System.out.println("Total value: "+(v[0]+v[1]));
		if((v[0]+v[1])>7)
			System.out.println(name+" won!");
		else
			System.out.println(name+" lost!");
	}
}
