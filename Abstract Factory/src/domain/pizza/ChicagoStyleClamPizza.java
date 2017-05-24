package domain.pizza;

public class ChicagoStyleClamPizza extends Pizza
{
	@Override
	public void prepare()
	{
		System.out.println("Preparing the Chicago clam pizza");
	}

	@Override
	public void bake()
	{
		System.out.println("Baking the Chicago clam pizza");
	}

	@Override
	public void cut()
	{
		System.out.println("Cutting the Chicago clam pizza");
	}

	@Override
	public void box()
	{
		System.out.println("Boxing the Chicago clam pizza\n");
	}
}
