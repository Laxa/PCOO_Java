package test;

import mode.validation.ValidationException;
import model.state.EMoleculeState;
import model.state.IStateChangeable;
import model.state.MoleculeStateMachine;
import models.AbstractMolecule;
import models.Water;

public class Main
{

	public static void main(String[] args)
	{
		test();
	}

	// test method to call the MoleculeStateMachine
	public static void changingState(IStateChangeable statedReference,
			EMoleculeState state)
	{
		try
		{
			MoleculeStateMachine.changeState(statedReference, state);
		} catch (ValidationException e)
		{
			System.out.println("failed: " + e.getMessage());
		}
	}

	public static void test()
	{
		System.out.println("Entering standart test");

		AbstractMolecule water = new Water(EMoleculeState.LIQUID_STATE);

		System.out.println(water.toString());

		System.out.println("Trying to change to same state...");
		changingState(water, EMoleculeState.LIQUID_STATE);
		System.out.println("water state is " + water.getState().toString());
		System.out.println("Trying a freezing...");
		changingState(water, EMoleculeState.SOLID_STATE);
		System.out.println("water state is " + water.getState().toString());
		System.out.println("Trying a sublimation...");
		changingState(water, EMoleculeState.VAPOR_STATE);
		System.out.println("water state is " + water.getState().toString());
		System.out.println("Trying a condensation...");
		changingState(water, EMoleculeState.LIQUID_STATE);
		System.out.println("water state is " + water.getState().toString());
		System.out.println("Trying a vaporization...");
		changingState(water, EMoleculeState.VAPOR_STATE);
		System.out.println("water state is " + water.getState().toString());
		System.out.println("Trying a deposition...");
		changingState(water, EMoleculeState.SOLID_STATE);
		System.out.println("water state is " + water.getState().toString());
		System.out.println("Trying a melting...");
		changingState(water, EMoleculeState.LIQUID_STATE);
		System.out.println("water state is " + water.getState().toString());
		System.out.println("test is now finished");
	}
}
