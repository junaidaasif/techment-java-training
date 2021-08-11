package oopsAssignment;

import java.util.Scanner;

class Address2{
	private String addressLine;
	private String city;
	public Address2(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
		
	}
	
	String getAddressDetails() {
		return addressLine +", " + city;
	}
}

class Customer2{
	private String customerName;
	private Address2 residentialAddress;
	Address2 officialAddress;
	
	public Customer2() {
		
	}
	
	
	
	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public Address2 getResidentialAddress() {
		return residentialAddress;
	}



	public void setResidentialAddress(Address2 residentialAddress) {
		this.residentialAddress = residentialAddress;
	}



	public Address2 getOfficialAddress() {
		return officialAddress;
	}



	public void setOfficialAddress(Address2 officialAddress) {
		this.officialAddress = officialAddress;
	}



	public Customer2(String customerName, Address2 residentialAddress, Address2
			officialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
		this.officialAddress = officialAddress;
	}
	
	String getCustomerDetails() {
//		System.out.println("Customer :" + customerName);
//		System.out.println("Residential Address :" + residentialAddress.getAddressDetails());
//		System.out.println("official Address :" + officialAddress.getAddressDetails());
		
		return "Customer :" + customerName + "\n" + "Residential Address :" + residentialAddress.getAddressDetails()+ "\n" + "official Address :" + officialAddress.getAddressDetails();
	}
	
	
}
public class TestCustomer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address2 address = new Address2("Ist Main HSR layout", "Banglore");
		Address2 officialAddress = new Address2("Ist Main Electronics layout", "Banglore");
		Customer2 customer = new Customer2("Junaid", address, officialAddress);
		System.out.println(customer.getCustomerDetails());
	}

}
