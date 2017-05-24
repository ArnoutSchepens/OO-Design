package domain.pizza;

public class NYStyleCheesePizza extends Pizza
{
	@Override
	public void prepare()
	{
		System.out.println("Preparing the NY cheese pizza");
	}
	
	@Override
	public void bake()
	{
		System.out.println("Baking the NY cheese pizza");
	}
	
	@Override
	public void cut()
	{
		System.out.println("Cutting the NY cheese pizza");
	}
	
	@Override
	public void box()
	{
		System.out.println("Boxing the NY cheese pizza\n");
	}
}
