package model.state;

import mode.validation.ValidationException;

public class MoleculeStateMachine
{
	public static void changeState(IStateChangeable statedReference,
			EMoleculeState newState) throws ValidationException
	{
		statedReference.validate(newState);

		statedReference.setState(newState);
	}
}
