public class Divisors {
	public static void main (String[] args) {
		
		int x = Integer.parseInt(args[0]);
		
		for (int i = 1; i <= x/2; i = i + 1) {
			
			if (x % i == 0) {
  			System.out.println(i);
			
			}
		
		}

		System.out.println(x);
	}
}
