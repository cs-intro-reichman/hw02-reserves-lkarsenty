
public class InOrder {
	public static void main (String[] args) {

	int num;		
	int newnum = -1;		
		
		do {
		num = newnum;
		newnum = (int)((Math.random() * 10));
		
			if (num <= newnum) {
			System.out.print(newnum + " ");
			}
		}

		while (num <= newnum );	
	}
}
