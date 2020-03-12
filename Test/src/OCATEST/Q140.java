package OCATEST;


//What will the following class print when executed?

public class Q140{
    static boolean a;
    static boolean b;
    static boolean c;
    public static void main (String[] args){
        boolean bool = (a = true) || (b = true) && (c = true);
        System.out.print(a + ", " + b + ", " + c);
    }
}

//Please select 1 option.
//
//true, false, true
//
//true, true, false
//
//true, false, false
//
//true, true, true
//
//Java parses the expression from left to right. Once it realizes that 
//the left operand of a conditional "or" operator has evaluated to true,
//it does not even try to evaluate the right side expression.