package model;

public class BankCustomer implements BankService{

	@Override
	public boolean aunthentiCate(String userId) {
		// TODO Auto-generated method stub
		if(userId.equalsIgnoreCase("CUST@123"))
		{
			return true;
		}
		return false;
	}

}
