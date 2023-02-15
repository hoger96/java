package model;

public class SalelistDto {

	String saleno;
	String pcode;
	String saledate;
	String scode;
	String name;
	String amount;
	String cost;
	
	public SalelistDto() {
		// TODO Auto-generated constructor stub
	}

	public SalelistDto(String saleno, String pcode, String saledate, String scode, String name, String amount,
			String cost) {
		super();
		this.saleno = saleno;
		this.pcode = pcode;
		this.saledate = saledate;
		this.scode = scode;
		this.name = name;
		this.amount = amount;
		this.cost = cost;
	}

	public String getSaleno() {
		return saleno;
	}

	public void setSaleno(String saleno) {
		this.saleno = saleno;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getSaledate() {
		return saledate;
	}

	public void setSaledate(String saledate) {
		this.saledate = saledate;
	}

	public String getScode() {
		return scode;
	}

	public void setScode(String scode) {
		this.scode = scode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "SalelistDto [saleno=" + saleno + ", pcode=" + pcode + ", saledate=" + saledate + ", scode=" + scode
				+ ", name=" + name + ", amount=" + amount + ", cost=" + cost + "]";
	}
	
}
