package domain;

public class Stereo
{

	private String location;

	public Stereo(String location)
	{
		this.location = location;
	}

	public void on()
	{
		System.out.println("Stereo on");
	}

	public void setCd()
	{
		System.out.println("set cd");
	}

	public void setVolume(int volume)
	{
		System.out.println("Set volume to " + volume);
	}

	public void off()
	{
		System.out.println("Stereo off");
	}

}
