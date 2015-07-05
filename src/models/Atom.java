package models;

public class Atom
{
	private String name;
	private String symbol;
	private Integer atomicNumber;

	// Constructor
	public Atom(String name, String symbol, int number)
	{
		this.setAtomicNumber(number);
		this.setName(name);
		this.setSymbol(symbol);
	}

	// GETTER & SETTERS
	public Integer getAtomicNumber()
	{
		return this.atomicNumber;
	}

	public void setAtomicNumber(int atomicNumber)
	{
		this.atomicNumber = atomicNumber;
	}

	public String getSymbol()
	{
		return this.symbol;
	}

	public void setSymbol(String symbol)
	{
		this.symbol = symbol;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	// Overriding toString
	@Override
	public String toString()
	{
		return "Atom[" + this.getAtomicNumber() + "] is called "
				+ this.getName() + " and his symbol is " + this.getSymbol();
	}
}
