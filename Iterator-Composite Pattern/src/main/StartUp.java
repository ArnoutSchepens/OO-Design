package main;

import java.util.List;

import domain.DinerMenu;
import domain.MenuItem;
import domain.PancakeHouseMenu;

public class StartUp
{

	public static void main(String[] args)
	{
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
		
		DinerMenu dinerMenu = new DinerMenu();
		MenuItem[] lunchItems = dinerMenu.getMenuItems();
		
//		for(int i = 0; i < breakfastItems.size(); i++)
//		{
//			MenuItem menuItem = (MenuItem) breakfastItems.get(i);
//			System.out.println(menuItem.getName());
//			System.out.println(menuItem.getDescription());
//			System.out.println(menuItem.isVegetarian());
//			System.out.println(menuItem.getPrice());
//		}
		
		breakfastItems.forEach(t -> 
		{
			System.out.println(t.getName());
			System.out.println(t.getDescription());
			System.out.println(t.isVegetarian());
			System.out.println(t.getPrice());
		});
		
		for(int i = 0; i < lunchItems.length; i++)
		{
			MenuItem menuItem = lunchItems[i];
			System.out.println(menuItem.getName());
			System.out.println(menuItem.getDescription());
			System.out.println(menuItem.isVegetarian());
			System.out.println(menuItem.getPrice());
		}
	}

}
