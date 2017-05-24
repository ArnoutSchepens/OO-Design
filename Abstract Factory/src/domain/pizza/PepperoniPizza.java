package domain.pizza;

import domain.ingredients.factory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza
{

	private PizzaIngredientFactory ingredientFactory;
	
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory)
	{
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare()
	{
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		pepperoni = ingredientFactory.createPepperoni();
		System.out.println("Dough:" + dough.toString() + "\nSauce: " + sauce.toString() + "\nCheese: " + cheese.toString() + "\nPepperoni" + pepperoni.toString());
	}
	
	
}
