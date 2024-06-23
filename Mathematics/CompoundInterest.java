
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    double P = sc.nextDouble();
	    double N = sc.nextDouble();
	    double R = sc.nextDouble();
	    
	    double I = (P * N * R) / 100;
	    
	    System.out.println("Simple Interest: "+ I);
	    
	    double A = Math.pow(P * (1 + (R/100)),N) ;
	    
	    System.out.println("Compound Interest: "+ A);
	}
}
