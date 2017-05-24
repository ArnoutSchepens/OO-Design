package domain.ingredients.factory;

import domain.ingredients.BruschettaSauce;
import domain.ingredients.Calamari;
import domain.ingredients.GoatCheese;
import domain.ingredients.ICheese;
import domain.ingredients.IDough;
import domain.ingredients.IPepperoni;
import domain.ingredients.ISauce;
import domain.ingredients.ISeafood;
import domain.ingredients.SlicedPepperoni;
import domain.ingredients.VeryThinCrust;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory
{

	@Override
	public IDough createDough()
	{
		return new VeryThinCrust();
	}

	@Override
	public ISauce createSauce()
	{
		return new BruschettaSauce();
	}

	@Override
	public ICheese createCheese()
	{
		return new GoatCheese();
	}

	@Override
	public ISeafood createSeafood()
	{
		return new Calamari();
	}

	@Override
	public IPepperoni createPepperoni()
	{
		return new SlicedPepperoni();
	}

}
