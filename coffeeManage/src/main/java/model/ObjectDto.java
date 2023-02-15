package model;

public class ObjectDto {

	String pcode;
	String name;
	String cost;
	
	public ObjectDto() {
		// TODO Auto-generated constructor stub
	}

	public ObjectDto(String pcode, String name, String cost) {
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
		return "ObjectDto [pcode=" + pcode + ", name=" + name + ", cost=" + cost + "]";
	}
	
}
