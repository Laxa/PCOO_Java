package model.state;

import mode.validation.ValidationException;

public class MoleculeStateMachine
{
	static void changeState(IStateChangeable statedReference,
			EMoleculeState newState) throws ValidationException
	{
		statedReference.validate(newState);
	}
}
