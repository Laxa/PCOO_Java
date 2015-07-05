package mode.validation;

import model.state.EMoleculeState;

public interface IValidable
{
	public void validate(EMoleculeState state) throws ValidationException;
}
