package domain.pizza;

public class ChicagoStyleCheesePizza extends Pizza
{
	@Override
	public void prepare()
	{
		System.out.println("Preparing the Chicago cheese pizza");
	}
	
	@Override
	public void bake()
	{
		System.out.println("Baking the Chicago cheese pizza");
	}
	
	@Override
	public void cut()
	{
		System.out.println("Cutting the Chicago cheese pizza");
	}
	
	@Override
	public void box()
	{
		System.out.println("Boxing the Chicago cheese pizza");
	}
}
