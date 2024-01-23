package java_patterns;

public class Reverse_Triangle {
	
//	*********
//	 ******* 
//	  *****  
//	   ***   
//	    *   

	public static void main(String[] args) {
		
		for(int i=1; i<=6; i++) {
			for(int s=1; s<i; s++ ) {
				System.out.print(" ");
			}
			for(int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			//tr
			for(int j=2; j<=6-i; j++) {
				System.out.print("*");
			}
			for(int s=1; s<i; s++ ) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}

}
