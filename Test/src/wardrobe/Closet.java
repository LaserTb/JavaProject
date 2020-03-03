package wardrobe;
import static clothes.Store.*;

import java.time.LocalDateTime;
public class Closet {
	public static void main(String[] args) {
		borrow();
		System.out.println(LocalDateTime.now());
	
	
	}
 private static void borrow() {
		System.out.println(" Borr:"+ getClothes());
	}
private static  String monday4 = " ";
}
