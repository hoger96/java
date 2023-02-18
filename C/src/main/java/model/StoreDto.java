package model;

public class StoreDto {

	String scode;
	String sname;
	String cost;
	
	public StoreDto() {
		// TODO Auto-generated constructor stub
	}

	public StoreDto(String scode, String sname, String cost) {
		super();
		this.scode = scode;
		this.sname = sname;
		this.cost = cost;
	}

	public String getScode() {
		return scode;
	}

	public void setScode(String scode) {
		this.scode = scode;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "StoreDto [scode=" + scode + ", sname=" + sname + ", cost=" + cost + "]";
	}
	
	
}
