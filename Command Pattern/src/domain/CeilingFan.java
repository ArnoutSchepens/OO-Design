package domain;

public class CeilingFan
{
	private String location;
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	private int speed;
	
	public CeilingFan(String location)
	{
		this.location = location;
		speed = OFF;
	}

	public void on()
	{
		System.out.println("Ceiling in " + location + " on");
	}
	
	public void high()
	{
		speed = HIGH;
	}
	
	public void medium()
	{
		speed = MEDIUM;
	}
	
	public void low()
	{
		speed = LOW;
	}

	public void off()
	{
		System.out.println("Ceiling in " + location + " off");
	}
	
	public int getSpeed()
	{
		return speed;
	}

}
