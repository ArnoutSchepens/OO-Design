package domain;

public class GarageDoor
{
	private String location;
	
	public GarageDoor(String location)
	{
		this.location = location;
	}
	
	public void open()
	{
		System.out.println("Open garagedoor");
	}
}
