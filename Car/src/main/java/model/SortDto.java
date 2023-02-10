package model;

public class SortDto {

	String c_class;
	String b_cost;
	
	public SortDto() {
		// TODO Auto-generated constructor stub
	}

	public SortDto(String c_class, String b_cost) {
		super();
		this.c_class = c_class;
		this.b_cost = b_cost;
	}

	public String getC_class() {
		return c_class;
	}

	public void setC_class(String c_class) {
		this.c_class = c_class;
	}

	public String getB_cost() {
		return b_cost;
	}

	public void setB_cost(String b_cost) {
		this.b_cost = b_cost;
	}

	@Override
	public String toString() {
		return "SortDto [c_class=" + c_class + ", b_cost=" + b_cost + "]";
	}
	
}
