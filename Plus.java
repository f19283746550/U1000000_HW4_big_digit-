import java.util.*;
public class Plus {
	private static char newN1[];
	private static char newN2[];
	private static char newN3[];
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
		System.out.println("Please input another number.");
		n=input.next();
		x=n.length();
		while(x!=0) {
			newN2 = new char[n.length()];
			for(int i=0;i<n.length();i++)newN2[i] = n.charAt(i);
			x=n.length();
			for(int i=0;i<n.length();i++) {
				if(Character.isDigit(newN2[i])) {
					x--;
				}
			}
			if(x!=0) {
				System.out.println("Please change another one,there must be something not belong to numbers.");
				n=input.next();
			}
		}
		if(newN1.length>=newN2.length) {
			x=newN1.length;
			int y=newN2.length;
			int b=0;
			newN3=new char[x];
			for(int i=x-1;i>=0;i--) {
				for(int a=y-1;a>=0;a--) {
					if(Integer.toString(Integer.parseInt(String.valueOf(newN1[i]))+Integer.parseInt(String.valueOf(newN2[a]))+b).length()==2) {
						newN3[i]=Integer.toString(Integer.parseInt(String.valueOf(newN1[i]))+Integer.parseInt(String.valueOf(newN2[a]))+b).charAt(1);
						b=1;
					}
					if(Integer.toString(Integer.parseInt(String.valueOf(newN1[i]))+Integer.parseInt(String.valueOf(newN2[a]))+b).length()==1) {
						newN3[i]=Integer.toString(Integer.parseInt(String.valueOf(newN1[i]))+Integer.parseInt(String.valueOf(newN2[a]))+b).charAt(0);
						b=0;
					}
					i--;
				}
				if(i<0) {
					break;
				}
				if(Integer.toString(Integer.parseInt(String.valueOf(newN1[i]))+b).length()==2) {
					newN3[i]=Integer.toString(Integer.parseInt(String.valueOf(newN1[i]))+b).charAt(1);
					b=1;
				}
				if(Integer.toString(Integer.parseInt(String.valueOf(newN1[i]))+b).length()==1) {
					newN3[i]=Integer.toString(Integer.parseInt(String.valueOf(newN1[i]))+b).charAt(0);
					b=0;
				}
			}
		}
		if(newN1.length<newN2.length) {
			x=newN2.length;
			int y=newN1.length;
			int b=0;
			newN3=new char[x];
			for(int i=x-1;i>=0;i--) {
				for(int a=y-1;a>=0;a--) {
					if(Integer.toString(Integer.parseInt(String.valueOf(newN1[a]))+Integer.parseInt(String.valueOf(newN2[i]))+b).length()==2) {
						newN3[i]=Integer.toString(Integer.parseInt(String.valueOf(newN1[a]))+Integer.parseInt(String.valueOf(newN2[i]))+b).charAt(1);
						b=1;
					}
					if(Integer.toString(Integer.parseInt(String.valueOf(newN1[a]))+Integer.parseInt(String.valueOf(newN2[i]))+b).length()==1) {
						newN3[i]=Integer.toString(Integer.parseInt(String.valueOf(newN1[a]))+Integer.parseInt(String.valueOf(newN2[i]))+b).charAt(0);
						b=0;
					}
					i--;
				}
				if(i<0) {
					break;
				}
				if(Integer.toString(Integer.parseInt(String.valueOf(newN2[i]))+b).length()==2) {
					newN3[i]=Integer.toString(Integer.parseInt(String.valueOf(newN2[i]))+b).charAt(1);
					b=1;
				}
				if(Integer.toString(Integer.parseInt(String.valueOf(newN2[i]))+b).length()==1) {
					newN3[i]=Integer.toString(Integer.parseInt(String.valueOf(newN2[i]))+b).charAt(0);
					b=0;
				}
			}
		}
		System.out.println(String.valueOf(newN1)+" + "+String.valueOf(newN2)+" = "+String.valueOf(newN3));
	}
}
