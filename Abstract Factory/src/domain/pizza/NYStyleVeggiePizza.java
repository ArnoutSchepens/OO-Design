package domain.pizza;

public class NYStyleVeggiePizza extends Pizza
{
	@Override
	public void prepare()
	{
		System.out.println("Preparing the NY veggie pizza");
	}

	@Override
	public void bake()
	{
		System.out.println("Baking the NY veggie pizza");
	}

	@Override
	public void cut()
	{
		System.out.println("Cutting the NY veggie pizza");
	}

	@Override
	public void box()
	{
		System.out.println("Boxing the NY veggie pizza\n");
	}
}
