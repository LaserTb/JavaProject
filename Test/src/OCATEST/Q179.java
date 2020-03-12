package OCATEST;

//Consider the following interface definition:
interface Bozo{
         int type = 0;
         public void jump();
}


//Now consider the following class:

public class Q179 implements Bozo{
         public Q179(){
             int type = 1;     // int is dec
         }

         public void jump(){
            System.out.println("jumping..."+type);
         }

         public static void main(String[] args){
            Bozo b = new Q179();
            b.jump();
         }
}

//Consider the following interface definition:
//interface Bozo{
//         int type = 0;
//         public void jump();
//}
//
//
//Now consider the following class:
//
//public class Type1Bozo implements Bozo{
//         public Type1Bozo(){
//            type = 1;
//         }
//
//         public void jump(){
//            System.out.println("jumping..."+type);
//         }
//
//         public static void main(String[] args){
//            Bozo b = new Type1Bozo();
//            b.jump();
//         }
//}
//
//What will the program print when compiled and run?
//
//

//What will the program print when compiled and run?
//
//Please select 1 option.
//
//jumping...0
//
//jumping...1
//
//This program will not compile.
//
//It will throw an exception at runtime.
//
//Fields defined in an interface are ALWAYS considered as public, static, and final. Even if you don't explicitly define them as such. In fact, you cannot even declare a field to be private or protected in an interface. Therefore, you cannot assign any value to 'type' outside the interface definition.
//
