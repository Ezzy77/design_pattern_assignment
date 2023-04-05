package assignment;

public class GranaryRoll_Burger extends Burger{

	public GranaryRoll_Burger(Filling f) {
		super(f);
		super.name = f.getFillingType();

	}

	@Override
	String getBurgerName() {
		return "Granary Roll with "+ this.name +" filling";
	}

}
