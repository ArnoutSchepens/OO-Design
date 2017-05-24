package domain.pizza;

public class ChicagoStyleGreekPizza extends Pizza
{
	@Override
	public void prepare()
	{
		System.out.println("Preparing the Chicago greek pizza");
	}

	@Override
	public void bake()
	{
		System.out.println("Baking the Chicago greek pizza");
	}

	@Override
	public void cut()
	{
		System.out.println("Cutting the Chicago greek pizza");
	}

	@Override
	public void box()
	{
		System.out.println("Boxing the Chicago greek pizza");
	}
}
