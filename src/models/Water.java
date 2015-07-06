package models;

import java.util.ArrayList;
import java.util.Arrays;

import model.state.EMoleculeState;

final public class Water extends AbstractMolecule
{
	// Default constructor using standard molecule with LIQUID_STATE
	public Water()
	{
		this(EMoleculeState.LIQUID_STATE);
	}

	// Standard molecule
	public Water(EMoleculeState state)
	{
		super(new ArrayList<AbstractAtom>(Arrays.asList(new Hydrogen(),
				new Oxygen())), "Water", "H2O", state);
	}
}
