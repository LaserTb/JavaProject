package OCATEST;

public class Q155 {

}
//Question 155
//
//Which of the following statements will evaluate to true?
//
//Please select 1 option.
//
//"String".replace('g','G') == "String".replace('g','G')
//
//"String".replace('g','g') == new String("String").replace('g','g')
//
//"String".replace('g','G')=="StrinG"
//
//"String".replace('g','g')=="String"
//
//None of these.
//
//There are 2 points to remember: 
//1. replace(char oldChar, char newChar) method returns 
//the same String object if both the parameters are same,
//i.e. if there is no change. Thus,
//"String" == "String".replace('g', 'g') will return true. 
//2. replace(CharSequence oldSeq,Â Â CharSequence newSeq) 
//method returns a new String object even if there is
//no change after replacement. 
//Thus, "String" == "String".replace("g", "g") will return false.