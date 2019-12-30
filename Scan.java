import java.util.*;
class Scan
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a no");
		int i=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a String");
		String s=sc.nextLine();
		System.out.println("The values you have Entered    "+i+"         "+s);
	}
}