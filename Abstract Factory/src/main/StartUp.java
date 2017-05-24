package main;

import domain.Pizzastore;
import domain.SimplePizzaFactory;

public class StartUp
{

	public static void main(String[] args)
	{
		Pizzastore pizzaStorre = new Pizzastore(new SimplePizzaFactory());
		pizzaStorre.orderPizza("cheese");
		pizzaStorre.orderPizza("clam");
	}

}
