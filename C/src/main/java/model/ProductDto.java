package model;

public class ProductDto {

	String pcode;
	String pname;
	String cost;
	
	public ProductDto() {
		// TODO Auto-generated constructor stub
	}

	public ProductDto(String pcode, String pname, String cost) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.cost = cost;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "ProductDto [pcode=" + pcode + ", pname=" + pname + ", cost=" + cost + "]";
	}
	
}
