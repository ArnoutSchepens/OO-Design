package domain.command;

import domain.GarageDoor;

public class GarageDoorDownCommand implements Command
{

	private GarageDoor garageDoor;
	
	public GarageDoorDownCommand(GarageDoor garageDoor)
	{
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute()
	{
		System.out.println("Garagedoor Down");
	}

}
