package models;

import java.util.ArrayList;
import java.util.List;

import mode.validation.ValidationException;
import model.state.EMoleculeState;
import model.state.IStateChangeable;

public abstract class AbstractMolecule implements IStateChangeable
{
	private List<Atom> listAtoms = new ArrayList<Atom>();
	private String name;
	private String formula;
	private EMoleculeState state;

	public AbstractMolecule(ArrayList<Atom> listAtoms, String name,
			String foruma, EMoleculeState state)
	{
		this.setListAtoms(listAtoms);
		this.setName(name);
		this.setFormula(foruma);
		this.setState(state);
	}

	// implementing IValidate interface
	@Override
	public void validate(EMoleculeState state) throws ValidationException
	{
		if (this.listAtoms.size() <= 0)
			throw new ValidationException(this.getName()
					+ " has no atoms in his arry");
		if (state == this.state)
			throw new ValidationException(this.getName() + " is already "
					+ state.toString());
	}

	// Implementing IStateChangeable
	@Override
	public EMoleculeState getState()
	{
		return this.state;
	}

	@Override
	public void setState(EMoleculeState state)
	{
		this.state = state;
	}

	// Getters and setters
	public void setFormula(String formula)
	{
		this.formula = formula;
	}

	public String getFormula()
	{
		return this.formula;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public List<Atom> getListAtoms()
	{
		return this.listAtoms;
	}

	public void setListAtoms(List<Atom> listAtoms)
	{
		this.listAtoms = listAtoms;
	}

	@Override
	public String toString()
	{
		return "I am a Molecule called " + this.getName() + ", my formula is "
				+ this.getFormula() + " and I am composed of those atoms : "
				+ this.getListAtoms().toString();
	}
}
