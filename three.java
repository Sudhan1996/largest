package largest;
import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		int a,b,c;
		String d;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers");
		a= s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		d=(a>b)&(a>c)? "a is larger" :((b>c)?"b is greater":"c is greater"); 
			System.out.println(d);
	}

}
