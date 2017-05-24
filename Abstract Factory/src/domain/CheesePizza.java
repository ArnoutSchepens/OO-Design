package domain;

public class CheesePizza extends Pizza
{
	@Override
	public void prepare()
	{
		System.out.println("Preparing the cheese pizza");
	}
	
	@Override
	public void bake()
	{
		System.out.println("Baking the cheese pizza");
	}
	
	@Override
	public void cut()
	{
		System.out.println("Cutting the cheese pizza");
	}
	
	@Override
	public void box()
	{
		System.out.println("Boxing the cheese pizza");
	}
}
