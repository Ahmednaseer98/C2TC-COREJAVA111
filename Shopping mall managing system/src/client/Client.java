
package client;

import com.application.GSNormalAcc;
import com.application.GSPrimeAcc;
import com.application.GSShopFactory;

public class Client
{
	public static void main(String[] args)
	{
		GSShopFactory gssfactory = new GSShopFactory();
		gssfactory.getNewPrimeAcc(1189,"Akbar", 499, true);
		gssfactory.getNewNormalAcc(2454,"Naseer" , 899, 60);
		
		GSPrimeAcc gsprime = new GSPrimeAcc();
		gsprime.getAccNm();
		gsprime.getAccNo();
		gsprime.getCharges();
		
		gsprime.bookProduct(6700);
		gsprime.toString();
		
		GSNormalAcc gsnormal = new GSNormalAcc();
		gsnormal.getAccNm();
		gsnormal.getAccNo();
		gsnormal.getCharges();
		gsnormal.getDeliveryCharges();
		
		gsnormal.bookProduct(5249);
		gsnormal.toString();
	}
}