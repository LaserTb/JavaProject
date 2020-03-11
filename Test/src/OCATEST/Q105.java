package OCATEST;

public class Q105 {

}
//Question 105
//
//Which of the following are true about the "default" constructor?
//
//Please select 2 options.
//
//It is provided by the compiler only if the class does not define any constructor.
//
//It initializes the instance members of the class.
//
//It calls the no-args constructor of the super class.
//
//It initializes instance as well as class fields of the class.
//
//It is provided by the compiler if the class does not define a 'no-args' constructor.
//
//The default constructor is provided by the compiler only when a class does not define ANY constructor explicitly. For example,
//public class A{
//  public A()  //This constructor is automatically inserted by the compiler because there is no other constructor defined by the programmer explicitly.
//  {
//    super();  //Note that it calls the super class' default no-args constructor.
//  }
//}
//public class A{
//  //Compiler will not generate any constructor because the programmer has defined a constructor.
//  public A(int i){
//     //do something
//  }
//}
//
