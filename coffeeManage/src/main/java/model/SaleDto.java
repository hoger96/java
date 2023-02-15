package model;

public class SaleDto {

	String saleno;
	String pcode;
	String saledate;
	String scode;
	String name;
	String amount;
	String total;
	
	public SaleDto() {
		// TODO Auto-generated constructor stub
	}

	public SaleDto(String saleno, String pcode, String saledate, String scode, String name, String amount,
			String total) {
		super();
		this.saleno = saleno;
		this.pcode = pcode;
		this.saledate = saledate;
		this.scode = scode;
		this.name = name;
		this.amount = amount;
		this.total = total;
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

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "SaleDto [saleno=" + saleno + ", pcode=" + pcode + ", saledate=" + saledate + ", scode=" + scode
				+ ", name=" + name + ", amount=" + amount + ", total=" + total + "]";
	}
	
}
