package model;

public class CheckDto {

	String l_code;
	String l_tire;
	String l_int;
	String l_egr;
	String l_run;
	String l_sc;
	
	public CheckDto() {
		// TODO Auto-generated constructor stub
	}

	public CheckDto(String l_code, String l_tire, String l_int, String l_egr, String l_run, String l_sc) {
		super();
		this.l_code = l_code;
		this.l_tire = l_tire;
		this.l_int = l_int;
		this.l_egr = l_egr;
		this.l_run = l_run;
		this.l_sc = l_sc;
	}

	public String getL_code() {
		return l_code;
	}

	public void setL_code(String l_code) {
		this.l_code = l_code;
	}

	public String getL_tire() {
		return l_tire;
	}

	public void setL_tire(String l_tire) {
		this.l_tire = l_tire;
	}

	public String getL_int() {
		return l_int;
	}

	public void setL_int(String l_int) {
		this.l_int = l_int;
	}

	public String getL_egr() {
		return l_egr;
	}

	public void setL_egr(String l_egr) {
		this.l_egr = l_egr;
	}

	public String getL_run() {
		return l_run;
	}

	public void setL_run(String l_run) {
		this.l_run = l_run;
	}

	public String getL_sc() {
		return l_sc;
	}

	public void setL_sc(String l_sc) {
		this.l_sc = l_sc;
	}

	@Override
	public String toString() {
		return "SaleonDto [l_code=" + l_code + ", l_tire=" + l_tire + ", l_int=" + l_int + ", l_egr=" + l_egr
				+ ", l_run=" + l_run + ", l_sc=" + l_sc + "]";
	}
	
}
