package domain.command;

import domain.GarageDoor;

public class GarageDoorUpCommand implements Command
{

	private GarageDoor garageDoor;
	
	public GarageDoorUpCommand(GarageDoor garageDoor)
	{
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute()
	{
		garageDoor.open();
	}

}
