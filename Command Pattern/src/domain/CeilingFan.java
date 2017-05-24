package domain;

public class CeilingFan
{
	private String location;

	public CeilingFan(String location)
	{
		this.location = location;
	}

	public void on()
	{
		System.out.println("Ceiling in " + location + " on");
	}

	public void off()
	{
		System.out.println("Ceiling in " + location + " off");
	}

}
