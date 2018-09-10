import java.util.Scanner;
public class TwoIntegersRunner 
{
	public static void main (String [] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("enter a number: ");
		int num1 = input.nextInt();
		System.out.println("Enter second number: ");
		int num2 = input.nextInt();
		
		TwoInteger twointeger = new TwoInteger(num1, num2);
		String a = twointeger.arithmetic();
		System.out.println(a);
		int b = twointeger.larger();
		System.out.println(b + " Is the larger number.");
		boolean c = twointeger.isEven();
		System.out.println( num1 + " + " + num2 + " is even: " + c);
		boolean d = twointeger.multiple();
		System.out.println(num1 + " is a multiple of " + num2 + ": " + d);
			
			
	}
}
