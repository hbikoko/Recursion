
public class Recursion {
	
	public static void main(String[] args) {
		//System.out.println(factorial(5));
		//System.out.println(reverse("string"));
		System.out.println(fib(3));
	}
	
	//should do: Multiply n by all integers before it, until you reach one
	//how can I find the factorial of (n-1)? Multiplies integers of n-1 and all
	//integers before it, until you reach one. Then, just multiply by n to stick it
	//on.
	//base case, recursive case, decrement
	public static int factorial(int n) {
   		if(n == 1) {
			return 1;
		} else { 
			//n--;
			factorial(n-1);
			//System.out.println(factorial(n-1) * n);
		}
		return factorial(n-1) * n;
	}
	
	//recursive case, base case, decrement
	//should do: It should reverse the given String
	//subproblem: How can I reverse the String - 1? Once you've 
	//reversed all characters besides the last one, you can just
	//stick the last character on the front 
	//base case:
	
	public static String reverse(String s) {
		if(s.length() == 1) {
			return s;
		} else {
			String c = s.substring(s.length() - 1);
			s = c + reverse(s.substring(0,s.length()-1));
		}
		return s;
		
	}
	
	//recursive case, base case, decrement
	//should do: find the sum of n-1 and n-2
	//subproblem: how can I find 
	
	public static int fib(int n) {
		if(n == 1 || n == 2) {
			return 1;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}

}
