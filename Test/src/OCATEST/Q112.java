package OCATEST;

public class Q112 {
	public static void main(String[] args) {
		String mStr ="123";
		long m= new Long(mStr);
		Long.parseLong(mStr);
		Long.valueOf(mStr).longValue();
	}

}
//Question 113
//
//Given:
//String mStr = "123";
//long m = // 1
//Which of the following options when put at //1 will assign 123 to m?
//
//Please select 3 options.
//
//new Long(mStr);                         ja
//
//Long.parseLong(mStr);                   ja
//
//Long.longValue(mStr);                   nein 
//
//(new Long()).parseLong(mStr);           nein
//
//Long.valueOf(mStr).longValue();         ja