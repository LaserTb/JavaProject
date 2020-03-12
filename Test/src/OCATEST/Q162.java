package OCATEST;

//What will be the output of the following class:
public class Q162{
  public void testRefs(String str, StringBuilder sb){
    str = str + sb.toString();
    sb.append(str);
    str = null;
    sb = null;
  }
  public static void main(String[] args){
    String s = "aaa";
    StringBuilder sb = new StringBuilder("bbb");
    new Q162().testRefs(s, sb);
    System.out.println("s="+s+" sb="+sb);
  }
}

//Please select 1 option.
//
//s=aaa sb=bbb
//
//s=null sb=null
//
//s=aaa sb=null
//
//s=null sb=bbbaaa
//
//s=aaa sb=bbbaaabbb
//
//Always remember that Strings are immutable, 
//you cannot change them. In this case, s refers to "aaa",
//and no matter what testRefs() method does,
//the variable s of main() will keep pointing to the same string "aaa". 
//StringBuilder on the other hand, is mutable. 
//So, initially sb is pointing to a StringBuilder object containing "bbb". 
//Its reference is passed to the testRefs() method. 
//In that method, we change the local variable str to point to
//a new string "aaa"+"bbb" = "aaabbb". Then we append this to sb.
//Therefore sb now contains "bbbaaabbb". 
//Setting 
//the local reference str and sb (in method testRefs()) to null, 
//does not affect the variables s and sb of the main() method.
