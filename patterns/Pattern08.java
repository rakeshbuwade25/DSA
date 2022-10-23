/*
		    * 
		   * * 
		  *   * 
		 *     * 
		*       * 
		*       * 
		 *     * 
		  *   * 
		   * * 
		    * 
 */


package patterns;

public class Pattern08 {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				if(k==0||k==i) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<n;k++) {
				if(k==i||k==n-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
