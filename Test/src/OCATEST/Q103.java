package OCATEST;

//What will the following code print?
public class Q103{
        int x = 5;
		
   public     int getX(){ return x; }

        public static void main(String args[]) throws Exception{
            Q103 tc = new Q103();
            tc.looper();
            System.out.println(tc.x);
        }
        
        public void looper(){
//            int x = 0;
            while( (x = getX()) != 0 ){
                for(int m = 10; m>=0; m--){
                    x = m;
                }
            }
            
       }     
}

//Please select 1 option.
//
//It will not compile.
//
//It will throw an exception at runtime.
//
//It will print 0.
//
//It will print 5.
//
//None of these.
//
//Note that looper() declares an automatic variable x, which shadows the instance variable x. So when x = m; is executed, it is the local variable x that is changed not the instance field x. So getX() never returns 0. If you remove int x = 0; from looper(), it will print 0 and end.
//
