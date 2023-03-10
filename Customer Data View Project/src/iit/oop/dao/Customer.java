package iit.oop.dao;

public class Customer {
	private Integer customerId;
	private String customerName;
	private Integer nid;
	private boolean customerStatus;
	
	public Customer(Integer customerId, String customerName, Integer nid, boolean customerStatus) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.nid = nid;
		this.customerStatus = customerStatus;
	}
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getNid() {
		return nid;
	}
	public void setNid(Integer nid) {
		this.nid = nid;
	}
	public boolean isCustomerStatus() {
		return customerStatus;
	}
	public void setCustomerStatus(boolean customerStatus) {
		this.customerStatus = customerStatus;
	}
	
	
	

}
