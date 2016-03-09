import java.util.*;
public class Plus {
	private static char newN1[];
	private static char newN2[];
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please input a number.");
		String n=input.next();
		int x=n.length();
		while(x!=0) {
			newN1 = new char[n.length()];
			for(int i=0;i<n.length();i++)newN1[i] = n.charAt(i);
			x=n.length();
			for(int i=0;i<n.length();i++) {
				if(Character.isDigit(newN1[i])) {
					x--;
				}
			}
			if(x!=0) {
				System.out.println("Please change another one,there must be something not belong to numbers.");
				n=input.next();
			}
		}
		System.out.println(newN1+" + ");
	}
}