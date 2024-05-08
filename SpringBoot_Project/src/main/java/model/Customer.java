package model;

import java.util.List;

public class Customer {
	private long customerId;
	private String customerName;
	private String customerEmail;
	private List<Long> customerPhone;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	public List<Long> getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(List<Long> customerPhone) {
		this.customerPhone = customerPhone;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerPhone=" + customerPhone + ", address=" + address + "]";
	}
	
}
