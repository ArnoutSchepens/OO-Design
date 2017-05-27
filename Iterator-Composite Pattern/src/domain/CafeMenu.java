package domain;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu
{
	private Map<String, MenuItem> menuItems = new Hashtable<>();
	
	public CafeMenu()
	{
		addItem("Veggie burger and Air Fries", "Veggie burger on a while wheat bun, lettuce, tomato, and fries", true, 3.99);
		addItem("Soup of the day", "A cup of soup of the dat, with a side salad", false, 3.69);
		addItem("Burrito", "A large burrito, with while pinto beans, salsa, guacamole", true, 4.29);
	}

	private void addItem(String name, String description, boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}

	@Override
	public Iterator<MenuItem> createIterator()
	{
		return menuItems.values().iterator();
	}
}
