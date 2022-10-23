/*
		* * * * * * * * * * 
		* * * *     * * * * 
		* * *         * * * 
		* *             * * 
		*                 * 
		*                 * 
		* *             * * 
		* * *         * * * 
		* * * *     * * * * 
		* * * * * * * * * * 
 */

package patterns;

public class Pattern20 {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=0;i<n;i++) {
			
			for(int a=i;a<n;a++) {
				System.out.print("* ");
			}
			for(int b=0;b<i;b++) {
				System.out.print("  ");
			}
			for(int c=0;c<i;c++) {
				System.out.print("  ");
			}
			for(int d=i;d<n;d++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
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
		
	}
}
