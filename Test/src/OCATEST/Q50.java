package OCATEST;

public class Q50 {


//Identify valid for constructs...
//Assume that Math.random() returns a double between 0.0 and 1.0 (not including 1.0).
//
//Please select 3 options.
//
//for(;Math.random()<0.5;){ Â Â Â Â System.out.println("true"); }geht 
//
//for(;;Math.random()<0.5){ Â Â Â Â System.out.println("true"); }geht nicht 
//
//for(;;Math.random()){ Â Â Â Â System.out.println("true"); }geht 
//
//for(;;){ Â Â Â Â Math.random()<.05? break : continue; }false
//
//for(;;){ Â Â Â Â if(Math.random()<.05) break; }richtig 
}

//Question 51
//
//Identify the valid for loop constructs assuming the following declarations:
//Object o = null;
//Collection c = //valid collection object.
//int[][] ia = //valid array
//
//Please select 2 options.
//
//for(o : c){ }
//
//for(final Object o2 :c){ } valid
//
//for(int i : ia) { }
//
//for(Iterator it : c.iterator()){ }
//
//for(int i : ia[0]){ } valid