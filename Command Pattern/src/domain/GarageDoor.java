package domain;

public class GarageDoor
{
	private String location;
	
	public GarageDoor(String location)
	{
		this.location = location;
	}
	
	public void up()
	{
		System.out.println("Garagedoor up in " + location);
	}

	public void down()
	{
		System.out.println("Garagedoor down in " + location);
	}
}
