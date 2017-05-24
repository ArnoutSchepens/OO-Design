package domain.pizzaStore;

import domain.pizza.CaliforniaStyleCheesePizza;
import domain.pizza.CaliforniaStyleClamPizza;
import domain.pizza.CaliforniaStyleGreekPizza;
import domain.pizza.CaliforniaStylePepperoniPizza;
import domain.pizza.CaliforniaStyleVeggiePizza;
import domain.pizza.ChicagoStyleClamPizza;
import domain.pizza.ChicagoStyleGreekPizza;
import domain.pizza.ChicagoStylePepperoniPizza;
import domain.pizza.ChicagoStyleVeggiePizza;
import domain.pizza.Pizza;

public class CaliforniaStylePizzaStore extends Pizzastore
{

	@Override
	protected Pizza createPizza(String type)
	{
		switch(type.toLowerCase())
		{
			case "cheese":
				return new CaliforniaStyleCheesePizza();
			case "greek":
				return new CaliforniaStyleGreekPizza();
			case "pepperoni":
				return new CaliforniaStylePepperoniPizza();
			case "veggie":
				return new CaliforniaStyleVeggiePizza();
			case "clam":
				return new CaliforniaStyleClamPizza();
			default:
				return null;
		}
	}

}
