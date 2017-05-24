package domain.pizzaStore;

import domain.pizza.ChicagoStyleCheesePizza;
import domain.pizza.ChicagoStyleClamPizza;
import domain.pizza.ChicagoStyleGreekPizza;
import domain.pizza.ChicagoStylePepperoniPizza;
import domain.pizza.ChicagoStyleVeggiePizza;
import domain.pizza.Pizza;

public class ChicagoStylePizzaStore extends Pizzastore
{

	@Override
	public Pizza createPizza(String type)
	{
		switch(type.toLowerCase())
		{
			case "cheese":
				return new ChicagoStyleCheesePizza();
			case "greek":
				return new ChicagoStyleGreekPizza();
			case "pepperoni":
				return new ChicagoStylePepperoniPizza();
			case "veggie":
				return new ChicagoStyleVeggiePizza();
			case "clam":
				return new ChicagoStyleClamPizza();
			default:
				return null;
		}
	}

}
