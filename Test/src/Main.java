//
//public class Main{ 
////           private  int i = 1; 
////	You cannot access an instance variable from a static method. 
//	
//	 private static  int i = 1;
//           public static void main(String argv[]){ 
//              int i = 2; 
//              Main s = new Main (); 
//              s.someMethod(); 
//              
//              String x= "Hello";
//              String z= " Hello".trim();//
//              System.out.println(x==z);//false
//              
//           } 
//           public static void someMethod(){ 
//              System.out.println(i); 
//           } 
//         } 
//

//1 will be printed out
//2 will be printed out
//A compile time error will be generated
//An exception will be thrown




////Which of the following statements are correct i
////f they replace the comment line? 
// public class Main{ 
//       public int i; 
//       public static void main(String argv[]){ 
//          Main sc = new Main(); 
//          // Comment line 
//
////          System.out.println(i);
//          System.out.println(sc.i);
////          System.out.println(Main.i);
//          System.out.println((new Main()).i);
//
//          
//       } 
//     } 
 


// public class Main {
//  public static void main(String[] args) {
//    int i; /*from www . j  a  v  a 2s .c o m*/
//    int j; 
//    for (i=1; i < 4; i++) { 
//       for (j=2; j < 4; j++) { 
//          if (j == 3) { 
//             continue; 
//          } 
//          System.out.println("i: " + i + " j: " + j); 
//       } 
//    } 
//  }
//}