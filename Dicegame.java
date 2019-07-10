import java.util.Random;
public class Dicegame{
	public static void main(String[] args) {
		Random r = new Random();
		int v[] = new int[2];
		System.out.println("Rolling the dice...");
		for(int i=0;i<2;i++) {
			v[i]=r.nextInt(6)+1;
			System.out.println("Die "+(i+1)+": "+v[i]);
		}
		System.out.println("Total value: "+(v[0]+v[1]));
	}
}
