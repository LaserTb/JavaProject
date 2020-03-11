package OCATEST;

public class Q128 {

}
//Question 128
//
//Consider the following interface definition:
//public interface ConstTest{
//	public int A = 1; //1
//	int B = 1;          //2
//	static int C = 1;  //3
//	final int D = 1; 	 //4
//	public static int E = 1; //5
//}
//Which line(s) will cause a compilation error?
//
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
//5                           
//
//None of them will cause any error.                   ja
//
//Any field in an interface is implicitly public, static,
//and final, whether these keywords are specified or not.