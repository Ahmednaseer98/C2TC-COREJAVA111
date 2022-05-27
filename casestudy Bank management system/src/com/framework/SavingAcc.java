package com.framework;

public class SavingAcc	extends BankAcc
{
	private boolean isSalaried;
	private static final float MINBAL = 1000;
	
	public SavingAcc() {}

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried)
	{
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	
	@Override
	public void withdraw(float accBal)
	{
		
	}

	@Override
	public String toString() 
	{
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}

	public boolean isSalaried() 
	{
		return isSalaried;
	}

	public void setSalaried(boolean isSalaried) 
	{
		this.isSalaried = isSalaried;
	}

	public static float getMinbal()
	{
		return MINBAL;
	}	
}