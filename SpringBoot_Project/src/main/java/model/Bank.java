package model;

public class Bank {
	BankService service;

	public BankService getService() {
		return service;
	}

	public void setService(BankService service) {
		this.service = service;
	}
	
	public String getLogin(String userId) {
		boolean flag = service.aunthentiCate(userId);
		if(flag) {
			return "login successfull";
		}
		return "login denied";
	}

}
