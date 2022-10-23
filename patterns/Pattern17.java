/*
		A 
		A B A 
		A B C B A 
		A B C D C B A 
		A B C D E D C B A 
 */

package patterns;

public class Pattern17 {

public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++) {
			char ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch++ +" ");
			}
			ch--;
			for(int k=1;k<i;k++) {
				System.out.print(--ch + " ");
			}
			System.out.println();
		}

	}

}
