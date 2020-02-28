
//public class Ex1 {
//	public static void main(String[] args) {
//		int [][]a = new int [3][];
//		a[1]= new int []{1,2,3};
//		a[2]=new int []{4,5};
//		System.out.println(a[1][1]);
//	}
//
//}


//public class Ex1 {
//	public static void main(String[] args) {
//		String S =" Java";
//		S.replace('6','7');
//		System.out.println(S);
//	}
//}


//public class Ex1 {
//	public static void main(String[] args) {
//		
//		int []a = {1,2,3,4};
//		int b[][] = {{1,2,3},{2,2,1},{0,43,2}};
//		System.out.println(" "+ (a[2]== b[2][1]));
//		
//	}
//}


//class Ex1 { 
//	public static void main(String[] args) 
//	{ 
//		int marks = 30; 
//		String result = marks > 35 ? "Pass" : "Fail"; 
//		System.out.println(result); 
//	} 
//} 


class Ex1 { 
	public static void main(String[] args) 
	{ 
		int marks = 90; 
		String result =        marks > 60 ? "Pass with 1st div."
				           :   marks < 50 ? "Pass with 2nd div." 

						//						:	marks < 40 ? "Pass with 3nd div.";
						//								Compile Time Erroe 
						//								Correction 
						   :    marks < 40 ? "Pass with 3nd div."
							:"Fail";
		System.out.println(result); 
	} 
} 

