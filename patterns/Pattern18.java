/*
		        1 
		      1 2 1 
		    1 2 3 2 1 
		  1 2 3 4 3 2 1 
		1 2 3 4 5 4 3 2 1 
 */

package patterns;

public class Pattern18 {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++) {
			int count=0;
			for(int j=i;j<n;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(++count +" ");
			}
			for(int m=1;m<i;m++) {
				System.out.print(--count +" ");
			}
			System.out.println();
		}
	}
	
}
