package domain.pizza;

import domain.ingredients.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza
{

	private PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory)
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
		System.out.println("Dough:" + dough.toString() + "\nSauce: " + sauce.toString() + "\nCheese: " + cheese.toString());
	}

}
