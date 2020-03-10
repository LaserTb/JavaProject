package OCATEST;


//class Test1 { 
//    public static void main(String[] args) 
//    { 
//        String ta = "A "; 
//        ta = ta.concat("B "); 
//        String tb = "C "; 
////        ta = ta.concat(tb); 
//        ta.replace('C', 'D'); 
//        ta = ta.concat(tb); 
//        System.out.println(ta); 
//    } 
//} 

class Test1 { 
    public static void main(String[] args) 
    { 
        int a = 10; 
        int b = 20; 
  
        if (++a <= 10 && --b < 20) {} 
          System.out.println("Output of && operator: "
                           + "a = " + a + " b = " + b); 
        System.out.println("-------------"); 
  
        a = 10; 
        b = 20; 
        if (++a <= 10 & --b < 20) {} 
          System.out.println("Output of & operator: "
                          + "a = " + a + " b = " + b); 
    } 
} 
