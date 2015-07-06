package model.state;

public enum EMoleculeState
{
	LIQUID_STATE("liquid"), SOLID_STATE("solid"), VAPOR_STATE("vapor");

	private String state;

	private EMoleculeState(String state)
	{
		this.state = state;
	}

	public String getState()
	{
		return this.state;
	}

	@Override
	public String toString()
	{
		return this.state;
	}
}
