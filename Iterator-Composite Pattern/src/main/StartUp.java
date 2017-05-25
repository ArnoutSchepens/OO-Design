package main;

import java.util.List;

import domain.CafeMenu;
import domain.DinerMenu;
import domain.MenuItem;
import domain.PancakeHouseMenu;
import domain.Waitress;

public class StartUp
{

	public static void main(String[] args)
	{
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
		
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
		
		waitress.printMenu();
	}

}
