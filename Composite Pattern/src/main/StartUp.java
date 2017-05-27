package main;

import domain.Menu;
import domain.MenuComponent;
import domain.MenuItem;
import domain.Waitress;

public class StartUp
{

	public static void main(String[] args)
	{
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
		
		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combines");
		
		pancakeHouseMenu.add(new MenuItem("K&B's Pancake breakfast", "Pancake with scrambled eggs, and toast", true, 2.99));
		pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99));
		pancakeHouseMenu.add(new MenuItem("BlueBerry Pancakes", "Pancakes made with fresh blueberries", true, 3.49));
		pancakeHouseMenu.add(new MenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59));
		
		dinerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));
		dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
		dinerMenu.add(new MenuItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29));
		dinerMenu.add(new MenuItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05));
		
		cafeMenu.add(new MenuItem("Veggie burger and Air Fries", "Veggie burger on a while wheat bun, lettuce, tomato, and fries", true, 3.99));
		cafeMenu.add(new MenuItem("Soup of the day", "A cup of soup of the dat, with a side salad", false, 3.69));
		cafeMenu.add(new MenuItem("Burrito", "A large burrito, with while pinto beans, salsa, guacamole", true, 4.29));
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		
		dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));
		dinerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59));
		
		Waitress waitress = new Waitress(allMenus);
		waitress.print();
	}

}
