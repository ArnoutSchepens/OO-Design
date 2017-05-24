package domain.command;

import domain.CeilingFan;

public class CeilingFanMediumCommand implements Command
{
	private CeilingFan ceilingFan;
	private int previousSpeed;

	public CeilingFanMediumCommand(CeilingFan ceilingFan)
	{
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute()
	{
		previousSpeed = ceilingFan.getSpeed();
		ceilingFan.medium();
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
