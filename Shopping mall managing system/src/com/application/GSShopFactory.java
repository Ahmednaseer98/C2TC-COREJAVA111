
package com.application;

import com.framework.ShopFactory;

public class GSShopFactory implements ShopFactory
{
	@Override
	public GSPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) 
	{
		GSPrimeAcc gsprime = new GSPrimeAcc(accNo, accNm, charges, isPrime);
		return gsprime;
	}
	
	@Override
	public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) 
	{
		GSNormalAcc gsnormal = new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
		return gsnormal;
	}
}