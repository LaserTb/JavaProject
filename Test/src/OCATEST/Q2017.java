package OCATEST;

public class Q2017 {

}
//Question 217
//
//Which of the following are correct ways to initialize the
//static variables MAX and CLASS_GUID ?
//class Widget{
//   static int MAX;     //1
//   static final String CLASS_GUID;   // 2
//   Widget(){
//       //3
//   }
//   Widget(int k){
//       //4
//   }
//}
//
//Please select 2 options.
//
//Modify lines //1 and //2 as : static int MAX = 111; static final String CLASS_GUID = "XYZ123";
//
//Add the following line just after //2 : static {� � MAX = 111; CLASS_GUID = "XYZ123"; }
//
//Add the following line just before //1 : { MAX = 111; CLASS_GUID = "XYZ123"; }
//
//Add the following line at //3 as well as //4 : MAX = 111; CLASS_GUID = "XYZ123";
//
//Only option 3 is valid.
//
//The rules are: 1. static variables can be left without being explicitly initialized. 
//(They will get default values). 2. final variables must be explicitly initialized. 
//Now, here CLASS_GUID is a 'static final' variable and not just final or static.
//As static fields can be accessed even without creating an instance of the class,
//it is entirely possible that this field can be accessed before even a� � single instance 
//is created. In this case, no constructor or non-static initializer had ever been called.
//And so, the field (as it is final and so must be initialized explicitly)
//remains uninitialized. This causes the compiler to complain.
//Had CLASS_GUID been just a final variable, option 4 would work but as it is also static,
//it cannot wait till the constructor executes to be initialized.