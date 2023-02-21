package model;

public class UserDto {

	String cust_no;
	String cust_name;
	String count;
	
	public UserDto() {
		// TODO Auto-generated constructor stub
	}

	public UserDto(String cust_no, String cust_name, String count) {
		super();
		this.cust_no = cust_no;
		this.cust_name = cust_name;
		this.count = count;
	}

	public String getCust_no() {
		return cust_no;
	}

	public void setCust_no(String cust_no) {
		this.cust_no = cust_no;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "UserDto [cust_no=" + cust_no + ", cust_name=" + cust_name + ", count=" + count + "]";
	}
	
}
