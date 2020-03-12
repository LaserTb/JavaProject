package OCATEST;

public class Q165 {
	public static void main(String[] args) {
//		System.out.println(null + true); //1
//		   System.out.println(true + null); //2
//		   System.out.println(null + null); //3
//		boolean b1 = true ;
//		boolean b2 = true ;
//		System.out.println(b1+ b2 );
		String s1 = null ;
		String s2 =null;
		System.out.println();
	}

}
//Question 165
//
//What will the following code print when compiled and run?
//
//public class TestClass {
//  public static void main(String[] args) {
//
//    String s = "blooper";
//    StringBuilder sb = new StringBuilder(s);
//    s.append("whopper");
//    sb.append("shopper");
//    
//    System.out.println(s);
//    System.out.println(sb);
//  }
//}
//
//Please select 1 option.
//
//blooper and bloopershopper
//
//blooperwhopper and bloopershopper
//
//blooper and blooperwhoppershopper
//
//It will not compile.
//
//append() method does not exist in String class.
//It exits only in StringBuffer and StringBuilder.
//The value of sb will be bloopershopper though.