package domain;

public class GreekPizza extends Pizza
{
	@Override
	public void prepare()
	{
		System.out.println("Preparing the greek pizza");
	}

	@Override
	public void bake()
	{
		System.out.println("Baking the greek pizza");
	}

	@Override
	public void cut()
	{
		System.out.println("Cutting the greek pizza");
	}

	@Override
	public void box()
	{
		System.out.println("Boxing the greek pizza");
	}
}
