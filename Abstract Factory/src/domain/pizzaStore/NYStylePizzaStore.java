package domain.pizzaStore;

import domain.ingredients.factory.NYPizzaIngredientFactory;
import domain.ingredients.factory.PizzaIngredientFactory;
import domain.pizza.CheesePizza;
import domain.pizza.ClamPizza;
import domain.pizza.GreekPizza;
import domain.pizza.PepperoniPizza;
import domain.pizza.Pizza;
import domain.pizza.VeggiePizza;

public class NYStylePizzaStore extends Pizzastore
{
	@Override
	public Pizza createPizza(String type)
	{
		Pizza pizza = null;
		
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		switch(type.toLowerCase())
		{
			case "cheese":
				pizza = new CheesePizza(ingredientFactory);
				pizza.setName("New York Style Cheese Pizza");
				break;
			case "greek":
				pizza = new GreekPizza(ingredientFactory);
				pizza.setName("New York Style Greek Pizza");
				break;
			case "pepperoni":
				pizza = new PepperoniPizza(ingredientFactory);
				pizza.setName("New York Style Pepperoni Pizza");
				break;
			case "veggie":
				pizza = new VeggiePizza(ingredientFactory);
				pizza.setName("New York Style Veggie Pizza");
				break;
			case "clam":
				pizza = new ClamPizza(ingredientFactory);
				pizza.setName("New York Style Clam Pizza");
				break;
		}
		
		return pizza;
	}
}