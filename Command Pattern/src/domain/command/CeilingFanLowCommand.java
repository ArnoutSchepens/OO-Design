package domain.command;

import domain.CeilingFan;

public class CeilingFanLowCommand implements Command
{
	
	private CeilingFan ceilingFan;
	private int previousSpeed;

	public CeilingFanLowCommand(CeilingFan ceilingFan)
	{
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute()
	{
		previousSpeed = ceilingFan.getSpeed();
		ceilingFan.low();
	}

	@Override
	public void undo()
	{
		if(previousSpeed == CeilingFan.HIGH)
		{
			ceilingFan.high();
		}
		else if(previousSpeed == CeilingFan.MEDIUM)
		{
			ceilingFan.medium();
		}
		else if(previousSpeed == CeilingFan.LOW)
		{
			ceilingFan.low();
		}
		else if(previousSpeed == CeilingFan.OFF)
		{
			ceilingFan.off();
		}
	}

}
