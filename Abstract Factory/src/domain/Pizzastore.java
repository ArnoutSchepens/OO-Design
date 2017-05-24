package domain;

public class Pizzastore
{
	private SimplePizzaFactory pizzaFactory;

	public Pizzastore(SimplePizzaFactory pizzaFactory)
	{
		this.pizzaFactory = pizzaFactory;
	}

	public Pizza orderPizza(String type)
	{
		Pizza pizza;

		pizza = pizzaFactory.createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	public SimplePizzaFactory getPizzaFactory()
	{
		return pizzaFactory;
	}

	public void setPizzaFactory(SimplePizzaFactory pizzaFactory)
	{
		this.pizzaFactory = pizzaFactory;
	}
}
