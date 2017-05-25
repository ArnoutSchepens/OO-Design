package main;

import java.util.ArrayList;
import java.util.List;

import domain.CafeMenu;
import domain.DinerMenu;
import domain.Menu;
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
		List<Menu> menus = new ArrayList<>();
		menus.add(pancakeHouseMenu);
		menus.add(dinerMenu);
		menus.add(cafeMenu);
		
		Waitress waitress = new Waitress(menus);
		
		waitress.printMenu();
	}

}
