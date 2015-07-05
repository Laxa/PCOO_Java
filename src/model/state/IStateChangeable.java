package model.state;

import mode.validation.IValidable;

public interface IStateChangeable extends IValidable
{
	public EMoleculeState getState();

	public void setState(EMoleculeState state);
}
