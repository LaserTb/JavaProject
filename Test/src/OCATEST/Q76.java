package OCATEST;



//What will be the result of compiling and running the following code?

class Base{
   public Object getValue(){ return new Object(); } //1
}

class Base2 extends Base{
   public String getValue(){ return "hello"; } //2
}

public class Q76{
   public static void main(String[] args){
      Base b = new Base2();
      System.out.println(b.getValue()); //3
   }
}
//
//Please select 1 option.
//
//It will print the hash code of the object.
//
//It will print hello.
//
//Compile time error at //1.
//
//Compile time error at //2.
//
//Compile time error at //3.
//
//Observe that at run time b points to an object of class Base2. Further,
//Base2 overrides getValue(). Therefore, Base2's getValue() will be invoked
//and it will return hello.