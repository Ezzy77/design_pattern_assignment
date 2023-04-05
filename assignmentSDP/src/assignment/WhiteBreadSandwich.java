package assignment;

public class WhiteBreadSandwich extends Burger{

	public WhiteBreadSandwich(Filling f) {
		super(f);
		super.name = f.getFillingType();
	}

	@Override
	String getBurgerName() {
		return "white bread sandwish with "+ this.name +" filling";
	}
	
	
}
