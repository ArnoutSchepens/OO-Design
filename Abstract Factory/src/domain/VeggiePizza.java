package domain;

public class VeggiePizza extends Pizza
{
	@Override
	public void prepare()
	{
		System.out.println("Preparing the veggie pizza");
	}

	@Override
	public void bake()
	{
		System.out.println("Baking the veggie pizza");
	}

	@Override
	public void cut()
	{
		System.out.println("Cutting the veggie pizza");
	}

	@Override
	public void box()
	{
		System.out.println("Boxing the veggie pizza");
	}
}
