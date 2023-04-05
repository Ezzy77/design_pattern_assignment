package assignment;

public class PlainRoll_burger extends Burger{
	
	public PlainRoll_burger(Filling f) {
		super(f);
		super.name = f.getFillingType();

	}

	@Override
	String getBurgerName() {
		return "Plain Roll with "+ this.name +" filling";
	}
	
}
