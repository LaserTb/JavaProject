package OCATEST;

public class Q163 {

}
//Question 163
//
//Given the following LOCs:
//
//   int rate = 10;
//   XXX amount = 1 - rate/100*1 - rate/100;
//
//What can XXX be?
//
//Please select 1 option.
//
//only int or long
//
//only long or double
//
//only double
//
//double or float
//
//long or double but not int or float.
//
//int, long, float or double
//
//Note that none of the terms in the expression 1 - rate/100*1 - rate/100;
//is double or float. They are all ints.
//So the result of the expression will be an int. 
//Since an int can be assigned to a variable 
//of type int, long, float or double, 
//amount can be int, long, float or double.

//
//Question 164
//
//What will the following code print?
//
//    String s = "blooper";
//    StringBuilder sb = new StringBuilder(s);
//    sb.append(s.substring(4)).delete(3, 5);
//    System.out.println(sb);
//
//Please select 1 option.
//
//blorbloo
//
//bloper
//
//bloerper
//
//blooperper
//
//bloo
//
//Please read the following description of substring 
//method of String and delete method of StringBuilder:  
//public String substring(int beginIndex) Â Â 
//Returns a new string that is a substring of this string.
//The substring begins with the character at the specified
//index and extends to the end of this string. 
//Examples: 
//"unhappy".substring(2) returns "happy" 
//"Harbison".substring(3) returns "bison" 
//"emptiness".substring(9) returns "" (an empty string)   
//public StringBuilder delete(int start, int end) Â Â 
//Removes the characters in a substring of this sequence. 
//The substring begins at the specified start and 
//extends to the character at index end - 1 or to the end 
//of the sequence if no such character exists. 
//If start is equal to end, no changes are made.
//
