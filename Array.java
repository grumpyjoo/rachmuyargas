package fall;
import java.util.*;

public class Array {
	/*
	 * Student name: Rachelle Muyargas
	 * Student ID: 4533324	
	 * Faculty: SUMITHRA CHANDRASEKAR
	 */
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter length of elements: ");
		int elems = sc.nextInt();
		
		
		String [] frutti = new String[elems];
		
		for(int i=0; i<frutti.length; i++) {
			frutti[i] = sc.next();
		}
		System.out.print("the last element is " + frutti[frutti.length-1] );
		
		//Find the Sum
		System.out.println("");
		System.out.println("----------");
		System.out.println("\nSum of 1 to 10: " + FindTheSum.A());
		System.out.println("Sum of 20 to 30: " + FindTheSum.B());
		System.out.println("Sum of 35 to 45: " + FindTheSum.C());
		
		System.out.println(Polymorphism.max());
		

	}

}