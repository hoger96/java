package model;

public class RegDto {

	String rev_id;
	String join_no;
	String kind;
	String rev_dt;
	String certification;
	String ck;
	
	public RegDto() {
		// TODO Auto-generated constructor stub
	}

	public RegDto(String rev_id, String join_no, String kind, String rev_dt, String certification, String ck) {
		super();
		this.rev_id = rev_id;
		this.join_no = join_no;
		this.kind = kind;
		this.rev_dt = rev_dt;
		this.certification = certification;
		this.ck = ck;
	}

	public String getRev_id() {
		return rev_id;
	}

	public void setRev_id(String rev_id) {
		this.rev_id = rev_id;
	}

	public String getJoin_no() {
		return join_no;
	}

	public void setJoin_no(String join_no) {
		this.join_no = join_no;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getRev_dt() {
		return rev_dt;
	}

	public void setRev_dt(String rev_dt) {
		this.rev_dt = rev_dt;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getCk() {
		return ck;
	}

	public void setCk(String ck) {
		this.ck = ck;
	}

	@Override
	public String toString() {
		return "RegDto [rev_id=" + rev_id + ", join_no=" + join_no + ", kind=" + kind + ", rev_dt=" + rev_dt
				+ ", certification=" + certification + ", ck=" + ck + "]";
	}
	
}
