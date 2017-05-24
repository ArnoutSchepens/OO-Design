package domain.pizzaStore;

import domain.SimplePizzaFactory;
import domain.pizza.NYStyleCheesePizza;
import domain.pizza.NYStyleClamPizza;
import domain.pizza.NYStyleGreekPizza;
import domain.pizza.NYStylePepperoniPizza;
import domain.pizza.NYStyleVeggiePizza;
import domain.pizza.Pizza;

public class NYStylePizzaStore extends Pizzastore
{
	@Override
	public Pizza createPizza(String type)
	{
		switch(type.toLowerCase())
		{
			case "cheese":
				return new NYStyleCheesePizza();
			case "greek":
				return new NYStyleGreekPizza();
			case "pepperoni":
				return new NYStylePepperoniPizza();
			case "veggie":
				return new NYStyleVeggiePizza();
			case "clam":
				return new NYStyleClamPizza();
			default:
				return null;
		}
	}
}