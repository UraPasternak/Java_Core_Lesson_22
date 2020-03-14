package ua.lviv.lgs.hw1;

interface Pet {
	void voice();
}

public class Main {

	public static void main(String[] args) {

		Pet cat = () -> System.out.println("Я кіт- Мяууу-Мяууу");
		Pet cow = () -> System.out.println("Я корова- Мууу-Мууу");
		Pet dog = () -> System.out.println("Я пес - Гаууу-Гаууу");

		cat.voice();
		cow.voice();
		dog.voice();
	}

}