import java.util.Scanner;
public class Plus {
	private static char newN1[];
	private static char newN2[];
	private static char newN3[];
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please input a number.");
		String n1=input.next();
		int x=n1.length();
		while(x!=0) {
			newN1 = new char[n1.length()];
			for(int i=0;i<n1.length();i++)newN1[i] = n1.charAt(i);
			x=n1.length();
			for(int i=0;i<n1.length();i++) {
				if(Character.isDigit(newN1[i])) {
					x--;
				}
			}
			if(x!=0) {
				System.out.println("Please change another one,there must be something not belong to numbers.");
				n1=input.next();
			}
		}
		System.out.println("Please input another number.");
		String n2=input.next();
		x=n2.length();
		while(x!=0) {
			newN2 = new char[n2.length()];
			for(int i=0;i<n2.length();i++)newN2[i] = n2.charAt(i);
			x=n2.length();
			for(int i=0;i<n2.length();i++) {
				if(Character.isDigit(newN2[i])) {
					x--;
				}
			}
			if(x!=0) {
				System.out.println("Please change another one,there must be something not belong to numbers.");
				n2=input.next();
			}
		}//只限整數
		if(n1.length()<n2.length()) {
			String n3=n1;
			n1=n2;
			n2=n3;
		}//只限位數多對位數少
		newN1 = new char[n1.length()];
		for(int i=0;i<n1.length();i++)newN1[i] = n1.charAt(i);
		newN2 = new char[n2.length()];
		for(int i=0;i<n2.length();i++)newN2[i] = n2.charAt(i);
		x=newN1.length;
		int y=newN2.length;
		int b=0;
		newN3=new char[x+1];
		for(int i=x-1;i>=0;i--) {
			if(i==x-1) {
				for(int a=y-1;a>=0;a--) {
					newN3[i+1]=Integer.toString((Integer.parseInt(String.valueOf(newN1[i]))+Integer.parseInt(String.valueOf(newN2[a]))+b)%10).charAt(0);
					if((Integer.parseInt(String.valueOf(newN1[i]))+Integer.parseInt(String.valueOf(newN2[a]))+b)>=10) {
						b=1;
					}
					if(Integer.parseInt(String.valueOf(newN1[i]))+Integer.parseInt(String.valueOf(newN2[a]))+b<10) {
						b=0;
					}若兩個相加大於等於10,b=1，然後在下一次加上去
					i--;
				}
			}
			if(i<0) {
				break;
			}//將if擺這是因為i若小於0在跑下面幾行會當掉
			newN3[i+1]=Integer.toString((Integer.parseInt(String.valueOf(newN1[i]))+b)%10).charAt(0);
			if(Integer.parseInt(String.valueOf(newN1[i]))+b>=10) {
				b=1;
			}
			if(Integer.parseInt(String.valueOf(newN1[i]))+b<10) {
				b=0;
			}//N1和N2都從最尾巴加到頭，前面調整過位數大小，因此N2理當先用完，剩下N1加到N3
		}
		if(b!=0) {
			newN3[0]=Long.toString(b).charAt(0);
		}//避免b還殘留1(ex:999和1。前面說i不能小於0所以最多到N1的最高位，因此這個例子若去掉這個if會跑出000)
		System.out.println(String.valueOf(newN3));
	}
}
