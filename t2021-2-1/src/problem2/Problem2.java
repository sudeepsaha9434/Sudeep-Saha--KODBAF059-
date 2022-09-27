package problem2;
import java.util.Scanner;
public class Problem2 {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
System.out.println("Input a= ");
int a=s.nextInt();

int n=a*2;
int i=0;
System.out.print(" Output: ");
do {
	if(i%2!=0) {
		System.out.print(" "+ i+", ");}
		i=i+1;

	}while(i<=n);
s.close();
}

}



