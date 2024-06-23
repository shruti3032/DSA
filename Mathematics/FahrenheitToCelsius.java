
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    double fahrenheit = sc.nextDouble();
	    double Celsius = (fahrenheit - 32) / 1.8;
		System.out.println("Celsius : "+Celsius);
		
// 		 double Celsius = sc.nextDouble();
// 	  	double fahrenheit = (Celsius * 1.8 ) + 32 ;
// 		System.out.println("Fahrenheit : "+fahrenheit);
	}
}
