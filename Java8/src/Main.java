public class Main {
	public static void main(String[] args) {
		AnimalMoveable ani = new AnimalMoveable();
		ani.display();
		ani.move();
		BirdMoveable b = new BirdMoveable();
		b.display();
		b.move();
	}

}