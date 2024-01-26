public class OneOfEach {
	public static void main (String[] args) {

		int isgirl = 0;
		int isboy = 0;
		
		do {
			if (Math.random()<0.5) {
				
				System.out.print("g ");
				isgirl = isgirl + 1;

			} else {
				System.out.print("b ");
				isboy +=1;
			}
		}
		while (isgirl == 0  || isboy == 0);
	System.out.println();
	System.out.println("You made it... and you now have " + (isboy + isgirl) + " children.");

	}
}
