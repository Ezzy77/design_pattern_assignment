package assignment;

public class BurgerMakerFacade {
	Burger burger;
	
	public BurgerMakerFacade(Burger b) {
		this.burger = b;
	}
	
	public void createBurger() {
		System.out.println("Order received for " + this.burger.getBurgerName());
	}
	
	public String getBurgerName() {
		return this.burger.getBurgerName();
		
	}
}
