package problem1;
import java.util.Scanner;
public class Problem1App {
	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		
		Problem1 m =new Problem1();
		System.out.println("Please Enter the First Number  := ");
		        m.a=s.nextDouble();
		        System.out.println("Please Enter the Second Number := ");
		        m.b=s.nextDouble();
		        
		  
		        System.out.println("Please Enter the mode of oppration you want to run :- ( +, -, *, / )");
		        char z=s.next().charAt(0);
		        switch (z)
		    	{
		    	case '+' : m.add();
		    					break;
		    	case '-' : m.sub();
		    	                break;
		    	case '*' : m.mul();
		    	                 break;
		    	case '/' : m.div();
		    	                break;
		    	default: System.out.println("Wrong Input");
		    		
		    		 }
	
		        s.close();
		
	}

}
