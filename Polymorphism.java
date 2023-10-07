package fall;

//method overloading: same function name different parameters
public class Polymorphism {
	/*
	 * Student name: Rachelle Muyargas
	 * Student ID: 4533324	
	 * Faculty: SUMITHRA CHANDRASEKAR
	 */

	public void sum(int a, int b) {
		int c = a+b;
		System.out.println("the value of c is " + c);
	}
	
	public void sum() {
		System.out.println("welcome");
	}
	
	static void max(int num1, int num2) {
		int result;
		
		if(num1 > num2) {
			result = num1;
		}else {
			result = num2;
		}
		
		System.out.println("the result is " + result);
	}
	
	public static void main(String[] args) {
		max(10, 20);
		Polymorphism x = new Polymorphism();
		x.sum(10,20);
		x.sum();
		
	}

}
