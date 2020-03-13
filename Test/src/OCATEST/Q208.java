package OCATEST;


//public What will the following program print?
public class Q208{
    public static void main(String args[]){
        int c = 0;
        boolean flag = true;
        for(int i = 0; i < 3; i++){
            while(flag){
                c++;
                if(i>+c || c>5) flag = false;
            }
        }
        System.out.println(c);
    }
}

//Please select 1 option.
//
//3
//
//4
//
//5
//
//6
//
//7
//
//In the first iteration of for loop, 
//the while loop keeps running till c becomes 6. Now, for all next for loop iteration,
//the while loop never runs as the flag is false. So final value of c is 6.



//public class Q208{
//    public static void main(String args[]){
//        int c = 0;
//        boolean flag = true;
//        for(int i = 0; i < 3; i++){
//            while(flag){
//                c++;
//                if(i>c || c++>5) flag = false;
//            }
//        }
//        System.out.println(c); // 8
//    }
//}


//
//public class Q208{
//    public static void main(String args[]){
//        int c = 0;
//        boolean flag = true;
//        for(int i = 0; i < 3; i++){
//            while(flag){
//                c++;
//                if(i>c++ || c++>5) flag = false;
//            }
//        }
//        System.out.println(c);      //9
//    }
//}


//public class Q208{
//    public static void main(String args[]){
//        int c = 0;
//        boolean flag = true;
//        for(int i = 0; i < 3; i++){
//            while(flag){
//                c++;
//                if(i>c++ || c>5) flag = false;
//            }
//        }
//        System.out.println(c);      //6
//    }
//}



//public class Q208{
//    public static void main(String args[]){
//        int c = 0;
//        boolean flag = true;
//        for(int i = 0; i < 3; ++i){
//            while(flag){
//                c++;
//                if(i>++c || c++>5) flag = false;
//            }
//        }
//        System.out.println(c);      //6
//    }
//}


//public class Q208{
//    public static void main(String args[]){
//        int c = 0;
//        boolean flag = true;
//        for(int i = 0; i < 3; i++){
//            while(flag){
//                
//                if(i>c++ || c++>5) flag = false;
//            }
//        }
//        System.out.println(c);      //8
//    }
//}




//public class Q208{
//    public static void main(String args[]){
//        int c = 0;
//        boolean flag = true;
//        for(int i = 0; i < 3; i++){
//            while(flag){
//               
//                if(i>c || c++>5) flag = false;
//            }
//        }
//        System.out.println(c);      //7
//    }
//}

//public class Q208{
//    public static void main(String args[]){
//        int c = 0;
//        boolean flag = true;
//        for(int i = 0; i < 3; i++){
//            while(flag){
//                if(i>c || c>5) flag = false;
//                c++;
//            }
//        }
//        System.out.println(c);      //7
//    }
//}






