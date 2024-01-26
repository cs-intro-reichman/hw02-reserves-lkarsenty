
public class DamkaBoard {
	public static void main(String[] args) {
		int board = Integer.parseInt(args[0]);
		
		for (int t = 0; t < board; t++) {

			if (t % 2 != 0) {
				for (int i = 0; i < board; i++) 
				System.out.print(" *");

			} else {				
  		
				for (int i = 0; i < board; i++) {
					System.out.print("* ");
				}
			}
		System.out.println();	

		}
	}
}
