package java_patterns;

public class Diamond_Pattern {
//	  * 
//	 ***
//	*****
//	 ***
//	  * 

	public static void main(String[] args) {
		
		for(int i=1; i<=3;i++) {
			for(int s=1;s<=3-i;s++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			// next Triangle
			for(int j=2;j<=i;j++) {
				System.out.print("*");
			}
			for(int s=1; s<3-i;s++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=1; i<3; i++) {
			for(int s=1; s<=i; s++ ) {
				System.out.print(" ");
			}
			for(int j=1; j<=3-i; j++) {
				System.out.print("*");
			}
			//tr
			for(int j=2; j<=3-i; j++) {
				System.out.print("*");
			}
			for(int s=1; s<i; s++ ) {
				System.out.print(" ");
			}
			
			System.out.println();
		}


	}

}
