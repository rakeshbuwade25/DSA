/*
		*                 * 
		* *             * * 
		* * *         * * * 
		* * * *     * * * * 
		* * * * * * * * * * 
		* * * * * * * * * * 
		* * * *     * * * * 
		* * *         * * * 
		* *             * * 
		*                 * 
 */

package patterns;

public class Pattern21 {
	
	public static void main(String[] args) {
		int n=5;
		
		for(int i=0;i<n;i++) {
			for(int a=0;a<=i;a++) {
				System.out.print("* ");
			}
			for(int b=i;b<n-1;b++) {
				System.out.print("  ");
			}
			for(int c=i;c<n-1;c++) {
				System.out.print("  ");
			}
			for(int d=0;d<=i;d++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		for(int j=0;j<n;j++) {

			for(int a=j;a<n;a++) {
				System.out.print("* ");
			}
			for(int b=0;b<j;b++) {
				System.out.print("  ");
			}
			for(int c=0;c<j;c++) {
				System.out.print("  ");
			}
			for(int d=j;d<n;d++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
