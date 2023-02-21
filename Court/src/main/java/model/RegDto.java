package model;

public class RegDto {

	String resv_no;
	String resv_date;
	String cust_no;
	String court_no;
	
	public RegDto() {
		// TODO Auto-generated constructor stub
	}

	public RegDto(String resv_no, String resv_date, String cust_no, String court_no) {
		super();
		this.resv_no = resv_no;
		this.resv_date = resv_date;
		this.cust_no = cust_no;
		this.court_no = court_no;
	}

	public String getResv_no() {
		return resv_no;
	}

	public void setResv_no(String resv_no) {
		this.resv_no = resv_no;
	}

	public String getResv_date() {
		return resv_date;
	}

	public void setResv_date(String resv_date) {
		this.resv_date = resv_date;
	}

	public String getCust_no() {
		return cust_no;
	}

	public void setCust_no(String cust_no) {
		this.cust_no = cust_no;
	}

	public String getCourt_no() {
		return court_no;
	}

	public void setCourt_no(String court_no) {
		this.court_no = court_no;
	}

	@Override
	public String toString() {
		return "RegDto [resv_no=" + resv_no + ", resv_date=" + resv_date + ", cust_no=" + cust_no + ", court_no="
				+ court_no + "]";
	}
	
}
