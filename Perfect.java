
public class Perfect {
	public static void main (String[] args) {
		
		int x = Integer.parseInt(args[0]);
		String perfect = x + " is a perfect number since " + x + " = 1";
		int sum = 0;
		
		for (int i = 1; i <= x/2; i = i + 1) {
			

			if (i != 1){

				if (x % i == 0) {
  				perfect = perfect + " + " + i;
				sum = sum + i;
				}
				
			} else {

				if (x % i == 0) {
  				perfect = perfect;
				sum = sum + i;
				}				
			}
			

		}

		if (sum == x){
			System.out.println(perfect);
		} else {
			System.out.println(x + " is not a perfect number");
		}
			
	}
}
