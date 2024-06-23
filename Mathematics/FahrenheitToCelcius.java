
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    double fahrenheit = sc.nextDouble();
	    double Celcius = (fahrenheit - 32) / 1.8;
		  System.out.println("Celcius : "+Celcius);
		
// 		double Celcius = sc.nextDouble();
// 	  double fahrenheit = (Celcius * 1.8 ) + 32 ;
// 		System.out.println("Fahrenheit : "+fahrenheit);
	}
}
