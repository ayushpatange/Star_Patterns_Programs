package java_patterns;

public class Side_Triangle_pattern {

	public static void main(String[] args) {
		
//		
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		int num=4;
		for(int i=num;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
