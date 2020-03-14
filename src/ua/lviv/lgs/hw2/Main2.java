package ua.lviv.lgs.hw2;

public class Main2 {

	interface konstrQwerty{
		Qwerty creat(int ag, int veg);
	}
	
	interface konstr2Qwerty{
		Qwerty creat(int ag, int veg, int ghj);
	}
	
	public static void main(String[] args) {
		konstrQwerty qwert1 = Qwerty::new;
		konstr2Qwerty qwert2 = Qwerty::new;
		
		System.out.println(qwert1.creat(5,7));
		System.out.println(qwert2.creat(5,10,15));
	}

}
