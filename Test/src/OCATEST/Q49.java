package OCATEST;

public class Q49 {
	public static void main(String[] args) {
		crazyLoop();
	}
	
static //	What will the following code print?
			void crazyLoop(){
			   int c = 0;
			   JACK: while (c < 8){
			       JILL: System.out.println(c);
			       if (c > 3) break JACK; else c++;
			   }
			}

}
//Question 49
//
//What will the following code print?
//void crazyLoop(){
//   int c = 0;
//   JACK: while (c < 8){
//       JILL: System.out.println(c);
//       if (c > 3) break JILL; else c++;
//   }
//}
//
//Please select 1 option.
//
// **It will not compile. The label JILL is missing
//
//It will throw an exception at runtime.
//
//It will print numbers from 0 to 8
//
//It will print numbers from 0 to 3
//
//It will print numbers from 0 to 4