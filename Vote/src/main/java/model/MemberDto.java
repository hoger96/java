package model;

public class MemberDto {

	String n_no;
	String n_name;
	String n_jumin;
	String n_degree;
	String p_no;
	String p_tel;
	
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(String n_no, String n_name, String n_jumin, String n_degree, String p_no, String p_tel) {
		super();
		this.n_no = n_no;
		this.n_name = n_name;
		this.n_jumin = n_jumin;
		this.n_degree = n_degree;
		this.p_no = p_no;
		this.p_tel = p_tel;
	}

	public String getN_no() {
		return n_no;
	}

	public void setN_no(String n_no) {
		this.n_no = n_no;
	}

	public String getN_name() {
		return n_name;
	}

	public void setN_name(String n_name) {
		this.n_name = n_name;
	}

	public String getN_jumin() {
		return n_jumin;
	}

	public void setN_jumin(String n_jumin) {
		this.n_jumin = n_jumin;
	}

	public String getN_degree() {
		return n_degree;
	}

	public void setN_degree(String n_degree) {
		this.n_degree = n_degree;
	}

	public String getP_no() {
		return p_no;
	}

	public void setP_no(String p_no) {
		this.p_no = p_no;
	}

	public String getP_tel() {
		return p_tel;
	}

	public void setP_tel(String p_tel) {
		this.p_tel = p_tel;
	}

	@Override
	public String toString() {
		return "MemberDto [n_no=" + n_no + ", n_name=" + n_name + ", n_jumin=" + n_jumin + ", n_degree=" + n_degree
				+ ", p_no=" + p_no + ", p_tel=" + p_tel + "]";
	}
	
}
