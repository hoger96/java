package model;

public class CourtDto {

	String cust_no;
	String cust_name;
	String resv_date;
	String court_no;
	String tel;
	
	public CourtDto() {
		// TODO Auto-generated constructor stub
	}

	public CourtDto(String cust_no, String cust_name, String resv_date, String court_no, String tel) {
		super();
		this.cust_no = cust_no;
		this.cust_name = cust_name;
		this.resv_date = resv_date;
		this.court_no = court_no;
		this.tel = tel;
	}

	public String getCust_no() {
		return cust_no;
	}

	public void setCust_no(String cust_no) {
		this.cust_no = cust_no;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getResv_date() {
		return resv_date;
	}

	public void setResv_date(String resv_date) {
		this.resv_date = resv_date;
	}

	public String getCourt_no() {
		return court_no;
	}

	public void setCourt_no(String court_no) {
		this.court_no = court_no;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "CourtDto [cust_no=" + cust_no + ", cust_name=" + cust_name + ", resv_date=" + resv_date + ", court_no="
				+ court_no + ", tel=" + tel + "]";
	}
	
}
