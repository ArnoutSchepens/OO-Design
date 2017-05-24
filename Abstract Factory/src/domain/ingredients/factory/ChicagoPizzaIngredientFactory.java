package domain.ingredients.factory;

import domain.ingredients.FrozenClams;
import domain.ingredients.ICheese;
import domain.ingredients.IDough;
import domain.ingredients.IPepperoni;
import domain.ingredients.ISauce;
import domain.ingredients.ISeafood;
import domain.ingredients.MozzarellaCheese;
import domain.ingredients.PlumTomatoSauce;
import domain.ingredients.SlicedPepperoni;
import domain.ingredients.ThickCrustDough;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory
{

	@Override
	public IDough createDough()
	{
		return new ThickCrustDough();
	}

	@Override
	public ISauce createSauce()
	{
		return new PlumTomatoSauce();
	}

	@Override
	public ICheese createCheese()
	{
		return new MozzarellaCheese();
	}

	@Override
	public ISeafood createSeafood()
	{
		return new FrozenClams();
	}

	@Override
	public IPepperoni createPepperoni()
	{
		return new SlicedPepperoni();
	}

}
