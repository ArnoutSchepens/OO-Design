package domain.pizza;

public class NYStyleClamPizza extends Pizza
{
	@Override
	public void prepare()
	{
		System.out.println("Preparing the NY clam pizza");
	}

	@Override
	public void bake()
	{
		System.out.println("Baking the NY clam pizza");
	}

	@Override
	public void cut()
	{
		System.out.println("Cutting the NY clam pizza");
	}

	@Override
	public void box()
	{
		System.out.println("Boxing the NY clam pizza\n");
	}
}
