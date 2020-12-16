@FunctionalInterface
public interface Moveable {
	public void move();
	public default void display() {
		System.out.println("hello from display");
	}
//can we override default methods - yes
	//why to declare the default methods : it will call for the every class
}
