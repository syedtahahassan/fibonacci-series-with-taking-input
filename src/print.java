package helloworld;
import java.util.Scanner;



public class hello {

	public static void main(String[] args) {
		int a=1,b=2,c,d;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter your range");
		d = s.nextInt();
		
		System.out.print(a);
		System.out.print(b);
		
		c=a+b;
		System.out.print(c);
		
		while(c<d)
		{
			
			a=b;
			b=c;
			c=a+b;
			System.out.print(c);
		}
		
	
	
	}