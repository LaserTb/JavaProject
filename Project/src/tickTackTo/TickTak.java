package tickTackTo;

public class TickTak {
	 static final String O = null;

	 static final int X = 0;
	
	public int player ;
	public int[][] bord= new int[3][3];
	

	
public void gewinner() {
	if(isGwinn(X)) {
		System.out.println(X + " ist Gewinner ");
	}
	else {
		System.out.println(O + " hat gewonnem ");
		
	}

	
}



private boolean isGwinn(int player) {
	if(true) {
		
	}
	return false;
}	
	
}
