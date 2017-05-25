package domain;

import java.util.Iterator;

public class Waitress
{
	private Menu pancakeHouseMenu;
	private Menu dinerMenu;
	private Menu cafeMenu;
	
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu, CafeMenu cafeMenu)
	{
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}
	
	public void printMenu()
	{
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
		Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
		
		System.out.println("MENU\n---\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerIterator);
		System.out.println("\nDINNER");
		printMenu(cafeIterator);
	}
	
	private void printMenu(Iterator<MenuItem> iterator)
	{
		while(iterator.hasNext())
		{
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem.getName() + ", " + menuItem.getPrice() + ", " + menuItem.getDescription());
		}
	}
}
