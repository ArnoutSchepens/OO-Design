package domain.pizza;

import domain.ingredients.factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza
{
	
	private PizzaIngredientFactory ingredientFactory;

	public ClamPizza(PizzaIngredientFactory ingredientFactory)
	{
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	public void prepare()
	{
		System.out.println("Prepareing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		seafood = ingredientFactory.createSeafood();
		System.out.println("Dough:" + dough.toString() + "\nSauce: " + sauce.toString() + "\nCheese: " + cheese.toString() + "\nSeafood: " + seafood.toString());
	}

}
