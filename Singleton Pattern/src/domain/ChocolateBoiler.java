package domain;

public class ChocolateBoiler
{
	private volatile static ChocolateBoiler chocolateBoiler;
	private boolean empty;
	private boolean boiled;

	private ChocolateBoiler()
	{
		empty = true;
		boiled = false;
	}

	public static ChocolateBoiler getInstance()
	{
		if(chocolateBoiler == null)
		{
			synchronized(ChocolateBoiler.class)
			{
				if(chocolateBoiler == null)
				{
					chocolateBoiler = new ChocolateBoiler();
				}
			}
		}
		return chocolateBoiler;
//		return new ChocolateBoiler();
	}

	public boolean isEmpty()
	{
		return empty;
	}

	public void setEmpty(boolean empty)
	{
		this.empty = empty;
	}

	public boolean isBoiled()
	{
		return boiled;
	}

	public void setBoiled(boolean boiled)
	{
		this.boiled = boiled;
	}

	public void fill()
	{
		if(isEmpty())
		{
			empty = false;
			boiled = false;
			System.out.println("Filling the chocolate boiler");
		}
		else
			System.out.println("Unable to fill the chocolate boiler");
	}

	public void boil()
	{
		if(!isEmpty() && !isBoiled())
		{
			boiled = true;
			System.out.println("Boiled the chocolate in the boiler");
		}
		else
			System.out.println("Unable to boil the chocolate");
	}

	public void drain()
	{
		if(!isEmpty() && isBoiled())
		{
			empty = true;
			System.out.println("Draining the chocolate boiler");
		}
		else
			System.out.println("Unable to drain the boiler");
	}

}
