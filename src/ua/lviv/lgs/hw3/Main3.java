package ua.lviv.lgs.hw3;

interface Amphibia{
	void metod();
}

public class Main3 {

	public static void main(String[] args) {
			
		Amphibia frogEat = ()->System.out.println("Я їм!");
		Amphibia frogSleep = ()->System.out.println("Я сплю!");
		Amphibia frogSwim = ()->System.out.println("Я плаваю!");
		Amphibia frogWalk = ()->System.out.println("Я гуляю!");
		
		frogEat.metod();
		frogSleep.metod();
		frogSwim.metod();
		frogWalk.metod();

	}

}