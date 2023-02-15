package model;

public class RegDto {

	String saleno;
	String pcode;
	String saledate;
	String scode;
	String amount;

	public RegDto() {
		// TODO Auto-generated constructor stub
	}

	public RegDto(String saleno, String pcode, String saledate, String scode, String amount) {
		super();
		this.saleno = saleno;
		this.pcode = pcode;
		this.saledate = saledate;
		this.scode = scode;
		this.amount = amount;
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

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "RegDto [saleno=" + saleno + ", pcode=" + pcode + ", saledate=" + saledate + ", scode=" + scode
				+ ", amount=" + amount + "]";
	}
	
	
}
