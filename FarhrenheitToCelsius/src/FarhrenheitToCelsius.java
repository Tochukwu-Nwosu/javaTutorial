import java.util.Scanner;

public class FarhrenheitToCelsius {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter value of temperature in farhrenheit: ");
		double farhrenheit = input.nextDouble();
		
		double celsius = ( 5.0 / 9 ) * ( farhrenheit - 32 );
		
		System.out.println( farhrenheit + " degree farhrenheit " + " is equivalent to " + celsius + " degree celsius.");
	}
}
