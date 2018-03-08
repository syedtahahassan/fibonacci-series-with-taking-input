package helloworld;



public class hello {

	public static void main(String[] args) {
		for (String string : args) {
			System.out.println(string);
		}
		int a=1,b=2,c,d;
//		Scanner s= new Scanner(System.in);
//		System.out.print("Enter your range");
//		d = s.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		
		c=a+b;
		System.out.println(c);
		
		d = Integer.parseInt(args[0]);
		System.out.println("output is --");
		while(c<d)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}
		System.out.println("bybye....");
		
	
	
	}
};