/*
		    1 
		   1 2 
		  1   3 
		 1     4 
		1 2 3 4 5 
 */

package patterns;

public class Pattern14 {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				if(i==1||i==n||k==1||k==i) {
					System.out.print(k+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
	
}
