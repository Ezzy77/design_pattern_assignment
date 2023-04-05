package assignment;

public class Kiosk {

	public static void main(String[] args) {
		BurgerMakerFacade bm1 = new BurgerMakerFacade(new PlainRoll_burger(new MeatFillling()));	
		bm1.createBurger();
		
		BurgerMakerFacade bm2 = new BurgerMakerFacade(new PlainRoll_burger(new SpicyMeatFilling()));	
		bm2.createBurger();
		
		BurgerMakerFacade bm3 = new BurgerMakerFacade(new GranaryRoll_Burger(new VeggieFilling()));	
		bm3.createBurger();
		
		BurgerMakerFacade bm4 = new BurgerMakerFacade(new WhiteBreadSandwich(new VeganFilling()));	
		bm4.createBurger();
			
		
//		Burger b1 = new PlainRoll_burger(new MeatFillling());
//		Burger b2 = new PlainRoll_burger(new SpicyMeatFilling());
//		Burger b3 = new GranaryRoll_Burger(new VeggieFilling());
//		Burger b4 = new WhiteBreadSandwich(new VeganFilling());
//				
		System.out.println("Order ready:\n" + bm1.getBurgerName() + "\n" + bm2.getBurgerName() + "\n" + bm3.getBurgerName() + "\n" + bm4.getBurgerName() + "\n");

		System.out.println("Normally terminating...");
	}
}
