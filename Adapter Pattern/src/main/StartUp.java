package main;

import domain.Duck;
import domain.MallardDuck;
import domain.Turkey;
import domain.TurkeyAdapter;
import domain.WildTurkey;

public class StartUp
{

	public static void main(String[] args)
	{
		Duck mallardDuck = new MallardDuck();
		Turkey wildTurkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
		
		System.out.println("The duck says...");
		TestDuck(mallardDuck);
		
		System.out.println("\nThe turkey says...");
		wildTurkey.gobble();
		wildTurkey.fly();
		
		System.out.println("\nThe turkeyAdapter says...");
		TestDuck(turkeyAdapter);
		
	}

	private static void TestDuck(Duck duck)
	{
		duck.quack();
		duck.fly();
	}

}
