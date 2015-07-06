package models;

import java.util.ArrayList;
import java.util.List;

import mode.validation.ValidationException;
import model.state.EMoleculeState;
import model.state.IStateChangeable;

public abstract class AbstractMolecule implements IStateChangeable
{
	private List<AbstractAtom> listAtoms = new ArrayList<AbstractAtom>();
	private String name;
	private String formula;
	private EMoleculeState state;

	public AbstractMolecule(ArrayList<AbstractAtom> listAtoms, String name,
			String formula, EMoleculeState state)
	{
		this.setListAtoms(listAtoms);
		this.setName(name);
		this.setFormula(formula);
		this.setState(state);
	}

	// implementing IValidate interface
	@Override
	public void validate(EMoleculeState state) throws ValidationException
	{
		if (this.getName().isEmpty())
			throw new ValidationException("The object has no name set");
		if (this.getFormula().isEmpty())
			throw new ValidationException(this.getName()
					+ " has no formula set");
		if (this.getListAtoms().size() <= 0)
			throw new ValidationException(this.getName()
					+ " has no atoms in his array");
		if (state == this.getState())
			throw new ValidationException(this.getName() + " is already in "
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

	public List<AbstractAtom> getListAtoms()
	{
		return this.listAtoms;
	}

	public void setListAtoms(List<AbstractAtom> listAtoms)
	{
		this.listAtoms = listAtoms;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();

		builder.append("I am a Molecule called " + this.getName()
				+ ", my formula is " + this.getFormula()
				+ " and I am composed of those atoms :");
		for (AbstractAtom value : this.getListAtoms())
		{
			builder.append("\n");
			builder.append(value);
		}
		return builder.toString();
	}
}
