package com.framework;

public class PrimeAcc extends ShopAcc
{
	private boolean isPrime;
	private static final float deliveryCharges = 0;
	
	public PrimeAcc() {}
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime)
	{
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}
	
	@Override
	public void bookProduct(float charges)
	{
		
	}

	public boolean isPrime() 
	{
		return isPrime;
	}

	public void setPrime(boolean isPrime) 
	{
		this.isPrime = isPrime;
	}

	public static float getDeliverycharges() 
	{
		return deliveryCharges;
	}
	
	@Override
	public String toString() 
	{
		return "PrimeAcc [isPrime=" + isPrime + "]"; 
	} 

}