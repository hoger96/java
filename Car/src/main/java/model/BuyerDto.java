package model;

public class BuyerDto {

	String b_id;
	String b_name;
	String b_code;
	String b_cost;
	String b_month;
	
	public BuyerDto() {
		// TODO Auto-generated constructor stub
	}

	public BuyerDto(String b_id, String b_name, String b_code, String b_cost, String b_month) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
		this.b_code = b_code;
		this.b_cost = b_cost;
		this.b_month = b_month;
	}

	public String getB_id() {
		return b_id;
	}

	public void setB_id(String b_id) {
		this.b_id = b_id;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public String getB_code() {
		return b_code;
	}

	public void setB_code(String b_code) {
		this.b_code = b_code;
	}

	public String getB_cost() {
		return b_cost;
	}

	public void setB_cost(String b_cost) {
		this.b_cost = b_cost;
	}

	public String getB_month() {
		return b_month;
	}

	public void setB_month(String b_month) {
		this.b_month = b_month;
	}

	@Override
	public String toString() {
		return "BuyerDto [b_id=" + b_id + ", b_name=" + b_name + ", b_code=" + b_code + ", b_cost=" + b_cost
				+ ", b_month=" + b_month + "]";
	}
	
}
