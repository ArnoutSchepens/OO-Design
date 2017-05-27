package domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent
{
	private List<MenuComponent> menuComponents = new ArrayList<>();;
	private String name;
	private String description;
	
	public Menu(String name, String description)
	{
		this.name = name;
		this.description = description;
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}
	
	@Override
	public void add(MenuComponent menuComponent)
	{
		menuComponents.add(menuComponent);
	}
	
	@Override
	public void remove(MenuComponent menuComponent)
	{
		menuComponents.remove(menuComponent);
	}
	
	@Override
	public MenuComponent getChild(int child)
	{
		return (MenuComponent) menuComponents.get(child);
	}

	@Override
	public void print()
	{
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
		
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while(iterator.hasNext())
		{
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			menuComponent.print();
		}
	}
}
