package practice2;

public class oneToN {
/*	static int p;
	public int getUserInput(int q) {
	p = q;
	return p;
	}
	
public static void main(String[] args) {
	System.out.println("entered number is :"+p);
	
	
}*/
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("print numbers upto :");
		int i = scan.nextInt();
		int j = 1;
		for (j =1; j <= i; j++ ){
			System.out.println(j);
		}
	}		
}
