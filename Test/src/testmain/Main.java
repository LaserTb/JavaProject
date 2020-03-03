package testmain;
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




//Which of the following statements are correct i
//f they replace the comment line? 
// public class Main{ 
////       public int i; 
//       public static void main(String argv[]){ 
//          Main sc = new Main(); 
//          // Comment line 
//          
////          System.out.println(i);
//          System.out.println(sc.i);
////          System.out.println(Main.i);
//          System.out.println((new Main()).i);  
//          System.out.println( 16  >>>  3); //16= 10000 to 2=10
//          System.out.println(8<<2);// 8=1000 << to 32=100000
//    	   
//    	   
//    	   

//    	   
//    	} 
//       } 
//     } 
 



////it will be printed out when the following code is executed 
////******default and two*****
// public class Main {
//	  public static void main(String[] args) {
//	    switch (5) {// w  w w.  j  a  v  a 2  s .  c  o  m
//	    case 0:
//	      System.out.println("zero");
//	      break;
//	    case 1:
//	      System.out.println("one");
//	    default:
//	      System.out.println("default");
//	    case 2:
//	      System.out.println("two");
//	      break;
//	    }
//	  }
//	}

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




public class Main { 
    public static int getVal() { 
        return 100; 
    } 
    public static void main(String args[]) { 
         int num = 10; 
        final int num2 = 20; 
        switch (num=10*3) { 
            // INSERT CODE HERE 

        case 10*3: System.out.println(2);
//        case num: System.out.println(3);
        case 10/3: System.out.println(4);
        case num2: System.out.println(5);

            break; 
            default: System.out.println("default"); 
        } 
    } 
} 



////Compilation error 
////10*2-20 is 0, which is duplicated with another 0 in the case statement.
//public class Main {
//	  public static void main(String args[]) {
//	    int num = 0;
//
//	    switch (num) {
//	    default:
//	      System.out.println("default");
//	    case 0:
//	      System.out.println("case1");
////	    case 10 * 2 - 20:
////	      System.out.println("case2");
////	      break;
//	    }
//	  }
//	}