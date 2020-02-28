package tickTackTo;

public class TickTak {
	 static final int O = 1;

	 static final int X = 0;
	
	public int player ;
	Bord  bord= new Bord();
	

	
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
