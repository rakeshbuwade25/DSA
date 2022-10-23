/*
		1 
		2 3 
		4 5 6 
		7 8 9 10 
		11 12 13 14 15 
		16 17 18 19 20 21 
		22 23 24 25 26 27 28 
 */

package patterns;

public class Pattern26 {

	public static void main(String[] args) {
		int count=1;
		int n=7;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count++ +" ");
			}
			System.out.println();
		}
	}
}
