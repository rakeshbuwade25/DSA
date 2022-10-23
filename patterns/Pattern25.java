/*
		* 
		* 1 *
		* 1 2 1 *
		* 1 2 3 2 1 *
		* 1 2 1 *
		* 1 *
		* 
 */

package patterns;

public class Pattern25 {
	
	public static void main(String[] args) {
		int n=3;
		
		for(int i=0;i<=n;i++) {
			int count=0;
			System.out.print("* ");
			for(int j=1;j<=i;j++) {
				System.out.print(++count +" ");
			}
			
			for(int k=1;k<i;k++) {
				System.out.print(--count +" ");
			}
			
			if(i!=0) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++) {
			System.out.print("* ");
			int count=0;
			for(int j=i;j<n-1;j++) {
				System.out.print(++count +" ");
			}
			
			for(int k=i;k<n-2;k++) {
				System.out.print(--count+" ");
			}
			if(i!=n-1) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
