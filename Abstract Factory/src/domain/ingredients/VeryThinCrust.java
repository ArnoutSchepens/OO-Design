package domain.ingredients;

public class VeryThinCrust implements IDough
{
	@Override
	public String toString()
	{
		return this.getClass().getSimpleName();
	}
}
