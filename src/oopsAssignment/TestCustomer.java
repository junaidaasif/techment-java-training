package oopsAssignment;

import java.util.Scanner;

class Address{
	private String addressLine;
	private String city;
	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}
	
	String getAddressDetails() {
		return addressLine +", " + city;
	}
	
	
}

class Customer{
	private String customerName;
	private Address residentialAddress;
	
	public Customer() {
		
	}
	
	
	
	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public Address getResidentialAddress() {
		return residentialAddress;
	}



	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}



	public Customer(String customerName, Address residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}
	
	void getCustomerDetails() {
		System.out.println("Customer :" + customerName);
		System.out.println("Residential Address :" + residentialAddress.getAddressDetails());
	}
}
public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address = new Address("Ist Main HSR layout", "Banglore");
		
		Customer customer0 = new Customer();
		customer0.setCustomerName("Aashu");
		customer0.setResidentialAddress(address);
		
		System.out.println(customer0.getCustomerName());
		System.out.println(customer0.getResidentialAddress());
		
		
		
		Customer customer = new Customer("Junaid", address);
		customer.getCustomerDetails();
	}

}
