/*
		1 2 3 4 5 
		1 2 3 4 
		1 2 3 
		1 2 
		1 
 */

package patterns;

public class Pattern11 {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}
	
}
