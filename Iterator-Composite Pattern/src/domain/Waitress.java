package domain;

import java.util.Iterator;
import java.util.List;

public class Waitress
{
	private List<Menu> menus;
	
	public Waitress(List<Menu> menus)
	{
		this.menus = menus;
	}
	
	public void printMenu()
	{
		Iterator<Menu> menuIterator = menus.iterator();
		while(menuIterator.hasNext())
		{
			Menu menu = (Menu) menuIterator.next();
			printMenu(menu.createIterator());
		}
	}
	
	private void printMenu(Iterator<MenuItem> iterator)
	{
		System.out.println(iterator.getClass().getSimpleName());
		
		while(iterator.hasNext())
		{
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem.getName() + ", " + menuItem.getPrice() + ", " + menuItem.getDescription());
		}
	}
}
