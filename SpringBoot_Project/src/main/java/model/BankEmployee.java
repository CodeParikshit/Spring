package model;

public class BankEmployee implements BankService{

	@Override
	public boolean aunthentiCate(String userId) {
		// TODO Auto-generated method stub
		if(userId.equalsIgnoreCase("Emp@123")) {
			return true;
		}
		return false;
		
	}

}
