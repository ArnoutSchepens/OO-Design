package domain.ingredients.factory;

import domain.ingredients.ICheese;
import domain.ingredients.IDough;
import domain.ingredients.IPepperoni;
import domain.ingredients.ISauce;
import domain.ingredients.ISeafood;

public interface PizzaIngredientFactory
{
	public IDough createDough();
	public ISauce createSauce();
	public ICheese createCheese();
	public ISeafood createSeafood();
	public IPepperoni createPepperoni();
}
