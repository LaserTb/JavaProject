package OCATEST;



//Which line will print the string "MUM"?

public class Q139{
   public static void main(String args []){
      String s = "MINIMUM";
      System.out.println(s.substring(4, 7)); //1
      System.out.println(s.substring(4)); //2
      System.out.println(s.substring(s.indexOf('M', 3))); //3
      System.out.println(s.substring(s.indexOf('M', 2))); //4
   }
}
//Which line will print the string "MUM"?
//
//public class TestClass{
//   public static void main(String args []){
//      String s = "MINIMUM";
//      System.out.println(s.substring(4, 7)); //1
//      System.out.println(s.substring(5)); //2
//      System.out.println(s.substring(s.indexOf('I', 3))); //3
//      System.out.println(s.substring(s.indexOf('I', 4))); //4
//   }
//}
//Please select 1 option.
//
//1
//
//2
//
//3
//
//4
//
//None of these.
//
//You should know how substring and indexOf methods of String class work.
//
//String substring(int beginIndex) 
//          Returns a new string that is a substring of this string. 
//String substring(int beginIndex, int endIndex) 
//          Returns a new string that is a substring of this string. 
//
//
//int indexOf(int ch) 
//          Returns the index within this string of the first occurrence of the specified character. 
// int indexOf(int ch, int fromIndex) 
//          Returns the index within this string of the first occurrence of the specified character,
//          starting the search at the specified index. 
// int indexOf(String str) 
//          Returns the index within this string of the first occurrence of the specified substring. 
// int indexOf(String str, int fromIndex) 
//          Returns the index within this string of the first occurrence of the specified substring, 
//          starting at the specified index.