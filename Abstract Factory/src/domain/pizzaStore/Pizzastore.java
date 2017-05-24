package domain.pizzaStore;

import domain.pizza.Pizza;

public abstract class Pizzastore
{
	
	public Pizza orderPizza(String type)
	{
		Pizza pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	abstract Pizza createPizza(String type);
	
}
