/*
		1 2 3 4 5 
		2     5 
		3   5 
		4 5 
		5 
 */

package patterns;

public class Pattern15 {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				if(i==1|i==n||j==i||j==n) {
					System.out.print(j+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
	
}
