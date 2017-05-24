package domain.command;

import domain.Stereo;

public class StereoOffWithCDCommand implements Command
{

	private Stereo stereo;
	
	public StereoOffWithCDCommand(Stereo stereo)
	{
		this.stereo = stereo;
	}
	
	@Override
	public void execute()
	{
		System.out.println("Stereo off");
	}

}
