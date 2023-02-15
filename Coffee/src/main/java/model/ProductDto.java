package model;

public class ProductDto {

	String pcode;
	String name;
	String cost;
	
	public ProductDto() {
		// TODO Auto-generated constructor stub
	}

	public ProductDto(String pcode, String name, String cost) {
		super();
		this.pcode = pcode;
		this.name = name;
		this.cost = cost;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "ProductDto [pcode=" + pcode + ", name=" + name + ", cost=" + cost + "]";
	}
	
	
}
