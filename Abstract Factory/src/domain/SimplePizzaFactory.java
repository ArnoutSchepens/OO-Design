package domain;

import domain.pizza.NYStyleCheesePizza;
import domain.pizza.NYStyleClamPizza;
import domain.pizza.NYStyleGreekPizza;
import domain.pizza.NYStylePepperoniPizza;
import domain.pizza.Pizza;
import domain.pizza.NYStyleVeggiePizza;

public class SimplePizzaFactory
{
	public static Pizza createPizza(String type)
	{
		Pizza pizza = null;
		
		switch(type.toLowerCase())
		{
			case "cheese":
				pizza = new NYStyleCheesePizza();
				break;
			case "greek":
				pizza = new NYStyleGreekPizza();
				break;
			case "pepperoni":
				pizza = new NYStylePepperoniPizza();
				break;
			case "veggie":
				pizza = new NYStyleVeggiePizza();
			case "clam":
				pizza = new NYStyleClamPizza();
		}
		
		return pizza;
	}
}
