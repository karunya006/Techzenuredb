package techzenure;
import java.util.Scanner;

public class ConditionalStaatement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int lar=((n1>n2)?(n1>n3)?n1:n3:(n2>n3)?n2:n3);
		//System.out.println("largest of (%d %d %d)=%d",n1 n2 n3 lar);
		sc.close();
	}
}
		
		
		
		
	


