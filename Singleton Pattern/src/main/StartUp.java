package main;

import domain.ChocolateBoiler;

public class StartUp
{

	public static void main(String[] args)
	{
		ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
		ChocolateBoiler singleton = ChocolateBoiler.getInstance();
		
		chocolateBoiler.fill();
		singleton.fill();
		chocolateBoiler.boil();
		singleton.boil();
		singleton.drain();
		chocolateBoiler.fill();
		chocolateBoiler.boil();
		singleton.drain();
	}

}
