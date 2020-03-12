package OCATEST;


public class Q156{
//Which code fragments will print the last argument given on 
//the command line to the standard output, 
//and exit without any output or exception stack trace 
//if no arguments are given?
////1.
// public static void main(String args[ ]){
//       if (args.length != 0)   System.out.println(args[args.length-1]);
// }
//
//2.
//public static void main(String args[ ]){
//       try {      System.out.println(args[args.length-1]);        }
//       catch (ArrayIndexOutOfBoundsException e) {    }
//}
//
//3.
// public static void main(String args[ ]){
//     int i = args.length;
//     if (i != 0) System.out.println(args[i-1]);
//}
//
//4.
//public static void main(String args[ ]){
//    int i = args.length-1;
//   if (i > 0) System.out.println(args[i]);
//}

//5.
// public static void main(String args[ ]){
//       try { System.out.println(args[args.length-1]); }
//       catch (NullPointerException e) {}
// }
}
//Please select 3 options.
//
//1
//
//2
//
//3
//
//4
//
//5
//
//If no argument is given, a String array of length Zero 
//is received in the main method. So,
//there is no NullPointerException on accessing args even 
//if no argument is given.
//Indexing in java starts from zero. 
//So the last element will be at args.length-1
