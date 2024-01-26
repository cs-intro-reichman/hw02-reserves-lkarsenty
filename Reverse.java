
public class Reverse {
	public static void main (String[] args){
		String s = args[0];

		int length = s.length();
		String reversed = "";
		
		for (int i = length - 1; i >= 0 ; i = i - 1) {
  		
		reversed = reversed + s.charAt(i);
		}

		System.out.println(reversed);
		System.out.println("The middle character is " + reversed.charAt((s.length())/2));

	}
}
