package tickTackTo;

public class Bord {
	public Bord(){
		this(-1,-1);
		
	}
	
	// Kon
	public Bord(int x, int y){
		if (x<0|| x>=2 ||y<0||y>=2){
			System.out.println("Es ist kein richtige bord position ");
		}
		else {
			
		}
	}
	
	
	public void printBord(){
		System.out.println("---------------");
		
		
		System.out.println("---------------");
	}

}
