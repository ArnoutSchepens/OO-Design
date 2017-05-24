package domain.ingredients.factory;

import domain.ingredients.FreshClams;
import domain.ingredients.ICheese;
import domain.ingredients.IDough;
import domain.ingredients.IPepperoni;
import domain.ingredients.ISauce;
import domain.ingredients.ISeafood;
import domain.ingredients.MarinaraSauce;
import domain.ingredients.ReggianoCheese;
import domain.ingredients.SlicedPepperoni;
import domain.ingredients.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory
{

	@Override
	public IDough createDough()
	{
		return new ThinCrustDough();
	}

	@Override
	public ISauce createSauce()
	{
		return new MarinaraSauce();
	}

	@Override
	public ICheese createCheese()
	{
		return new ReggianoCheese();
	}

	@Override
	public ISeafood createSeafood()
	{
		return new FreshClams();
	}

	@Override
	public IPepperoni createPepperoni()
	{
		return new SlicedPepperoni();
	}


}
