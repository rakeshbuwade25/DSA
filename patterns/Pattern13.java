/*
		          1 
		        2 3 2 
		      3 4 5 4 3 
		    4 5 6 7 6 5 4 
		  5 6 7 8 9 8 7 6 5 
 */

package patterns;

public class Pattern13 {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++) {
			int count=i-1;
			for(int j=i;j<=n;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(++count +" ");
			}
			for(int m=1;m<i;m++) {
				System.out.print(--count + " ");
			}
			System.out.println();
		}
	}
	
}
