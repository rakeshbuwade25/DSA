/*
		1
		2 * 2
		3 * 3 * 3
		4 * 4 * 4 * 4
		4 * 4 * 4 * 4
		3 * 3 * 3
		2 * 2
		1
 */

package patterns;

public class Pattern23 {
	
	public static void main(String[] args) {
		int n=4;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1) {
					System.out.print(i);
				}else {
					System.out.print(" * "+i);
				}
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				if(j==1) {
					System.out.print(n-i+1);
				}else {
					System.out.print(" * "+(n-i+1));
				}
			}
			System.out.println();
		}
	}

}
