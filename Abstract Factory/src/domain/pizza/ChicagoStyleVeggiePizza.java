package domain.pizza;

public class ChicagoStyleVeggiePizza extends Pizza
{
	@Override
	public void prepare()
	{
		System.out.println("Preparing the Chicago veggie pizza");
	}

	@Override
	public void bake()
	{
		System.out.println("Baking the Chicago veggie pizza");
	}

	@Override
	public void cut()
	{
		System.out.println("Cutting the Chicago veggie pizza");
	}

	@Override
	public void box()
	{
		System.out.println("Boxing the Chicago veggie pizza\n");
	}
}
