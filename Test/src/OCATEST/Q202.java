package OCATEST;

// Given the following code, which of these statements are true?
	public	class Q202{
	   public static void main(String args[]){
	      int k = 0;
	      int m = 0;
	      for ( int i = 0; i <= 3; i++){
	         k++;
	         if ( i == 2){
	        	 i=i+m;
//	        	 i=m++;
//	        	 i=4;
	            // line 1
	        	 
//		        if (i=k) {
//					i=k+m;
//				} 
	         }
	         m++;
	      }
	         

	        	 
//	        	
	      System.out.println( k + ", " + m );
	   }
	}

//	This is a simple loop. All you need to do is execute each statement in your head. 
//	For example, if line 1 is replaced by break:  
//		1. k=0, m=0 2. iteration 1: i=0 Â Â Â Â 2.1 k = 1 Â Â Â Â 2.2 i == 2 is false Â Â Â Â 2.3 m = 1 3. iteration 2: i = 1 Â Â Â Â 3.1 k=2 Â Â Â Â 3.2 i==2 is false Â Â Â Â 3.3 m = 2 4. iteration 3: i = 2 Â Â Â Â 4.1 k=3 Â Â Â Â 4.2 i==2 is true Â Â Â Â 4.3 break 5. print 3, 2