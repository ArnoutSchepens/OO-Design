package domain.ingredients;

public class ThinCrustDough implements IDough
{
	@Override
	public String toString()
	{
		return this.getClass().getSimpleName();
	}
}
