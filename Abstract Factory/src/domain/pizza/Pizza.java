package domain.pizza;

import domain.ingredients.ICheese;
import domain.ingredients.IDough;
import domain.ingredients.IPepperoni;
import domain.ingredients.ISauce;
import domain.ingredients.ISeafood;

public abstract class Pizza
{

	String name;
	IDough dough;
	ISauce sauce;
	ICheese cheese;
	ISeafood seafood;
	IPepperoni pepperoni;

	public void setName(String name)
	{
		this.name = name;
	}
	
	public abstract void prepare();

	public void bake()
	{
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut()
	{
		System.out.println("Cutting the pizza into slices");
	}
	
	public void box()
	{
		System.out.println("Place pizza in official PizzaStore box\n");
	}
	
	public String toString()
	{
		return name;
	}

}
