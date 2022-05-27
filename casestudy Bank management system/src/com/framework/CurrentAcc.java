
package com.framework;

public class CurrentAcc extends BankAcc
{
	protected final float creditLimit = 10000;
	
	public CurrentAcc() {}

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) 
	{
		super(accNo, accNm, accBal);
	}
	
	@Override
	public void withdraw(float accBal)
	{
		
	}

	@Override
	public String toString() 
	{
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}

	public float getCreditLimit()
	{
		return creditLimit;
	}
}