package error;

public class exc {

	private static final char[] result = null;
	public static void  main(String[] args) {
		
		exc ex= new exc();
		String s = ex.exceptions();
		
		System.out.println(s);

	}
	public static  String exceptions() {
		  String result = "";
	  String v = null;
		  try {
		  try {
		  result += "before";
		  v.length();
		  result += "after";
		  }
		  catch (NullPointerException e) {
		  result += "catch";
		  throw new RuntimeException();
		  } finally {
		  result += "finally";
		  throw new Exception();
		  }
		  } catch (Exception e) {
		  result += "done";
		  }
		  return result;
		  }

}
