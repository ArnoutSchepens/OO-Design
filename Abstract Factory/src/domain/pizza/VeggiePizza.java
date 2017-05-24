package domain.pizza;

import domain.ingredients.factory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza
{
	private PizzaIngredientFactory ingredientFactory;
	
	public VeggiePizza(PizzaIngredientFactory ingredientFactory)
	{
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare()
	{
		System.out.println("Preparing" + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		System.out.println("Dough:" + dough.toString() + "\nSauce:" + sauce.toString());
	}
	
	
}
