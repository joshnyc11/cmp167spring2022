package week9;

public class CatTest {

	public static void main(String[] args) {
	
		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat("Maxine", 6, " Siamese");
		Cat Cat3 = new Cat (" Georgie", 5, " Bengal");
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(Cat3);
		
		Cat3.meow();
	}

}
