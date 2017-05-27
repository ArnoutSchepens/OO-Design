package domain;

public class Waitress
{
	private MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus)
	{
		this.allMenus = allMenus;
	}
	
	public void print()
	{
		allMenus.print();
	}

}
