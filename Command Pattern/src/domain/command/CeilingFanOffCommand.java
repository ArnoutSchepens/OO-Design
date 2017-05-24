package domain.command;

import domain.CeilingFan;

public class CeilingFanOffCommand implements Command
{

	private CeilingFan ceilingFan;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan)
	{
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute()
	{
		System.out.println("Ceiling fan off");
	}

}
