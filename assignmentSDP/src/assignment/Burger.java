package assignment;

public abstract class Burger {
	Filling filling;
	String name;
	
	public Burger(Filling f) {
		this.filling = f;
	}
	
	abstract String getBurgerName();
}
