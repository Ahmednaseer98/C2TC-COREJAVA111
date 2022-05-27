package com.customer;
import com.application.MMBankFactory;
import com.application.MMCurrentAcc;
import com.framework.MMSavingAcc;

public class Customer
{
	public static void main(String[] args) 
	{
		MMBankFactory mmbfactory = new MMBankFactory();
		mmbfactory.getNewSavingAcc(14545, "Roshan", 1500, true);
		mmbfactory.getNewCurrentAcc(15651, "Suraj", 3000, 15000);
		MMSavingAcc mmsaving = new MMSavingAcc();
		mmsaving.getAccNo();
		mmsaving.getAccNm();
		mmsaving.getAccBal();
		mmsaving.withdraw(750);
		mmsaving.toString();
		
		MMCurrentAcc mmcurrent = new MMCurrentAcc();
		mmcurrent.getAccNo();
		mmcurrent.getAccNm();
		mmcurrent.getAccBal();
		mmcurrent.getCreditLimit();
		
		mmcurrent.withdraw(1100);
		mmcurrent.toString();
	}
}