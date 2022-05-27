package com.application;

import com.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{
	private static final float deliveryCharges = 0;

	public GSPrimeAcc() {}
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) 
	{
		super(accNo, accNm, charges, isPrime);
	}
	
	@Override
	public void bookProduct(float charges)
	{
		System.out.println("Dear Prime User: \n 		Free Delivery \n		Your Product Charges are:"+charges);
	}

	@Override
	public String toString() 
	{
		return "GSPrimeAcc [Charges : "+ deliveryCharges +"]";
	}

	public static float getDeliverycharges()
	{
		return deliveryCharges;
	}
	
}