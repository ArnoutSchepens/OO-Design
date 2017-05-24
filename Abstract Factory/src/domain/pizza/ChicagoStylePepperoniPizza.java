package domain.pizza;

public class ChicagoStylePepperoniPizza extends Pizza
{
	@Override
	public void prepare()
	{
		System.out.println("Preparing the Chicago pepperoni pizza");
	}

	@Override
	public void bake()
	{
		System.out.println("Baking the Chicago pepperoni pizza");
	}

	@Override
	public void cut()
	{
		System.out.println("Cutting the Chicago pepperoni pizza");
	}

	@Override
	public void box()
	{
		System.out.println("Boxing the Chicago pepperoni pizza\n");
	}
}
