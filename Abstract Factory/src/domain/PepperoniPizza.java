package domain;

public class PepperoniPizza extends Pizza
{
	@Override
	public void prepare()
	{
		System.out.println("Preparing the pepperoni pizza");
	}

	@Override
	public void bake()
	{
		System.out.println("Baking the pepperoni pizza");
	}

	@Override
	public void cut()
	{
		System.out.println("Cutting the pepperoni pizza");
	}

	@Override
	public void box()
	{
		System.out.println("Boxing the pepperoni pizza");
	}
}
