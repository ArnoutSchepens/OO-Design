package domain;

public class ClamPizza extends Pizza
{
	@Override
	public void prepare()
	{
		System.out.println("Preparing the clam pizza");
	}

	@Override
	public void bake()
	{
		System.out.println("Baking the clam pizza");
	}

	@Override
	public void cut()
	{
		System.out.println("Cutting the clam pizza");
	}

	@Override
	public void box()
	{
		System.out.println("Boxing the clam pizza");
	}
}
