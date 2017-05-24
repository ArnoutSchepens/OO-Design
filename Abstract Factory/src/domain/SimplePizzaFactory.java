package domain;

public class SimplePizzaFactory
{
	public Pizza createPizza(String type)
	{
		Pizza pizza = null;
		
		switch(type.toLowerCase())
		{
			case "cheese":
				pizza = new CheesePizza();
				break;
			case "greek":
				pizza = new GreekPizza();
				break;
			case "pepperoni":
				pizza = new PepperoniPizza();
				break;
			case "veggie":
				pizza = new VeggiePizza();
			case "clam":
				pizza = new ClamPizza();
		}
		
		return pizza;
	}
}
