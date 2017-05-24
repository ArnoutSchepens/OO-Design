package domain.pizzaStore;

import domain.ingredients.factory.CaliforniaPizzaIngredientFactory;
import domain.ingredients.factory.PizzaIngredientFactory;
import domain.pizza.CheesePizza;
import domain.pizza.ClamPizza;
import domain.pizza.GreekPizza;
import domain.pizza.PepperoniPizza;
import domain.pizza.Pizza;
import domain.pizza.VeggiePizza;

public class CaliforniaStylePizzaStore extends Pizzastore
{

	@Override
	protected Pizza createPizza(String type)
	{
		Pizza pizza = null;

		PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();

		switch(type.toLowerCase())
		{
			case "cheese":
				pizza = new CheesePizza(ingredientFactory);
				pizza.setName("California Style Cheese Pizza");
				break;
			case "greek":
				pizza = new GreekPizza(ingredientFactory);
				pizza.setName("California Style Greek Pizza");
				break;
			case "pepperoni":
				pizza = new PepperoniPizza(ingredientFactory);
				pizza.setName("California Style Pepperoni Pizza");
				break;
			case "veggie":
				pizza = new VeggiePizza(ingredientFactory);
				pizza.setName("California Style Veggie Pizza");
				break;
			case "clam":
				pizza = new ClamPizza(ingredientFactory);
				pizza.setName("California Style Clam Pizza");
				break;
		}

		return pizza;
	}

}
