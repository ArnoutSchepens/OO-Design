package domain.pizza;

public class NYStylePepperoniPizza extends Pizza
{
	@Override
	public void prepare()
	{
		System.out.println("Preparing the NY pepperoni pizza");
	}

	@Override
	public void bake()
	{
		System.out.println("Baking the NY pepperoni pizza");
	}

	@Override
	public void cut()
	{
		System.out.println("Cutting the NY pepperoni pizza");
	}

	@Override
	public void box()
	{
		System.out.println("Boxing the NY pepperoni pizza");
	}
}
