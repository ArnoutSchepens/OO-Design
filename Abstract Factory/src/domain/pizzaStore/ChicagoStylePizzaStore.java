package domain.pizzaStore;

import domain.ingredients.factory.ChicagoPizzaIngredientFactory;
import domain.ingredients.factory.PizzaIngredientFactory;
import domain.pizza.CheesePizza;
import domain.pizza.ClamPizza;
import domain.pizza.GreekPizza;
import domain.pizza.PepperoniPizza;
import domain.pizza.Pizza;
import domain.pizza.VeggiePizza;

public class ChicagoStylePizzaStore extends Pizzastore
{

	@Override
	public Pizza createPizza(String type)
	{
		Pizza pizza = null;

		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

		switch(type.toLowerCase())
		{
			case "cheese":
				pizza = new CheesePizza(ingredientFactory);
				pizza.setName("Chicago Style Cheese Pizza");
				break;
			case "greek":
				pizza = new GreekPizza(ingredientFactory);
				pizza.setName("Chicago Style Greek Pizza");
				break;
			case "pepperoni":
				pizza = new PepperoniPizza(ingredientFactory);
				pizza.setName("Chicago Style Pepperoni Pizza");
				break;
			case "veggie":
				pizza = new VeggiePizza(ingredientFactory);
				pizza.setName("Chicago Style Veggie Pizza");
				break;
			case "clam":
				pizza = new ClamPizza(ingredientFactory);
				pizza.setName("Chicago Style Clam Pizza");
				break;
		}

		return pizza;
	}

}
