package main;

import domain.CaffeineBeverage;
import domain.Coffee;
import domain.Tea;

public class StartUp
{

	public static void main(String[] args)
	{
		CaffeineBeverage tea = new Tea();
		tea.prepareRecipe();
		
		System.out.println();
		CaffeineBeverage coffee = new Coffee();
		coffee.prepareRecipe();
	}

}
