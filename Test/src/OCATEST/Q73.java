package OCATEST;

public class Q73 {
	
//		What will the following program print?



	public static void main(String args[]) {
		int counter = 0;
		outer:
			for (int i = 0; i < 3; i++) {
				middle:
					for (int j = 0; j < 3; j++) {
						inner:
							for (int k = 0; k < 3; k++) {
								if (k-j> 0) {
									break middle;
								}
								counter++;
							}
					}
			}
		System.out.println(counter);
	}
}

//public static void main(String args[]) {
//    int counter = 0;
//    outer:
//    for (int i = 0; i < 3; i++) {
//        middle:
//        for (int j = 0; j < 3; j++) {
//            inner:
//            for (int k = 0; k < 3; k++) {
//                if (j-k> 0) {
//                    break middle;    here print 9
//                }
//                counter++;
//            }
//        }
//    }
//    System.out.println(counter);
//}
//}

//				Please select 1 option.
//
//				2
//
//				3
//
//				6
//
//				7
//
//				9

//
//class LoopTest{
//    public static void main(String args[]) {
//        int counter = 0;
//        outer:
//        for (int i = 0; i < 3; i++) {
//            middle:
//            for (int j = 0; j < 3; j++) {
//                inner:
//                for (int k = 0; k < 3; k++) {
//                    if (k - j > 0) {
//                        break middle;
//                    }
//                    counter++;
//                }
//            }
//        }
//        System.out.println(counter);
//    }
//}


//Question 74
//
//Which of the following are valid operators in Java?
//
//Please select 4 options.
//
//!
//
//~
//
//&
//
//%=
//
//$ not 