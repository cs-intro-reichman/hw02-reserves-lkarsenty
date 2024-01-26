import java.util.Random;

public class OneOfEachStats {
	public static void main (String[] args) {
		
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		
        Random generator = new Random(seed);  
		String max;
		int two = 0;
		int three = 0;
		int fourandmore = 0;
		float count = 0;


		for (int i = 0; i < T; i++){

			int isgirl = 0;
			int isboy = 0;
			
			do {
				if (generator.nextDouble()<0.5) {
				isgirl = isgirl + 1;
				} else {
				isboy +=1;
				}
				
			}
			while (isgirl == 0  || isboy == 0);

			if (isboy + isgirl == 2) {
				two += 1;
			} else if (isboy + isgirl == 3) {
				three += 1;
			} else {
				fourandmore += 1;
			}
			count = count + isboy + isgirl;
		}

		if (two > three && two > fourandmore) {
			max = "2";	
			} else if (three > two && three > fourandmore) {
				max = "3";
			} else {
				max = "4 or more";
			}

		System.out.println("Avrage: " + (count/T) + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + two);
		System.out.println("Number of families with 3 children: " + three);
		System.out.println("Number of families with 4 or more children: " + fourandmore);
		System.out.println("The most common number of children is " + max + "." );

	}
}
