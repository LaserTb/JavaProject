package tickTackTo;

public class Bord {
	public Bord(){
		 
		
	}
	public Bord(int x, int y){
		if (x<0|| x>=2 ||y<0||y>=2){
			System.out.println(" kein richtige bord position ");
		}
	}

}
