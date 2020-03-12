package OCATEST;

public class Q178 {

}
//Question 178
//
//What can be done to get the following code to compile and run? (Assume that the options are independent of each other.)
//public float parseFloat( String s ){
//     float f = 0.0f;      // 1
//     try{
//          f = Float.valueOf( s ).floatValue();    // 2
//          return f ;      // 3
//     }
//     catch(NumberFormatException nfe){
//        f = Float.NaN ;    // 4
//       return f;     // 5
//     }
//     finally {
//         return f;     // 6
//     }
//     return f ;    // 7
// }
//
//Please select 4 options.
//
//Remove line 3, 6
//
//Remove line 5
//
//Remove line 5, 6
//
//Remove line 7
//
//Remove line 3, 7
//
//Basically, an unreachable statement causes a compilation error (There is one exception: if(false) { ... } is valid.). As such, line 7 is unreachable because of the return statement in finally. This is because finally is always executed and there it returns a value, so there is no way line 7 can be executed! Â Â Â Â  When you remove the lines suggested by the options, all the lines of code are executed in one case or another. For example, in option 1, if you comment line 3 and 6, Line 7 will be executed if no exception is thrown in the try block.  We suggest you to try working out other scenarios yourself in a similar manner.
//
