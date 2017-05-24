package main;

import domain.pizzaStore.ChicagoStylePizzaStore;
import domain.pizzaStore.NYStylePizzaStore;
import domain.pizzaStore.Pizzastore;

public class StartUp
{

	public static void main(String[] args)
	{
		Pizzastore nyPizzastore = new NYStylePizzaStore();
		nyPizzastore.orderPizza("cheese");
		
		Pizzastore chicagoPizzaStore = new ChicagoStylePizzaStore();
		chicagoPizzaStore.orderPizza("clam");
		
	}

}
