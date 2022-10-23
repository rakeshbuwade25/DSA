/*
		3 
		4 4 
		5 5 5 
		6 6 6 6 
		5 5 5 
		4 4 
		3 
 */

package patterns;

public class Pattern22 {
	
	public static void main(String[] args) {
		int n=4;
		
		int count=2;
		for(int i=1;i<=n;i++) {
			count++;
			for(int j=1;j<=i;j++) {
				System.out.print(count +" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<n;i++) {
			count--;
			for(int j=i;j<n;j++) {
				System.out.print(count+" ");
			}
			System.out.println();
		}
		
	}

}
