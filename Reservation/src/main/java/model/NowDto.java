package model;

public class NowDto {

	String rev_id;
	String name;
	String tel;
	String kind;
	String rev_dt;
	String certification;
	String ck;
	
	public NowDto() {
		// TODO Auto-generated constructor stub
	}

	public NowDto(String rev_id, String name, String tel, String kind, String rev_dt, String certification, String ck) {
		super();
		this.rev_id = rev_id;
		this.name = name;
		this.tel = tel;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
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
		return "NowDto [rev_id=" + rev_id + ", name=" + name + ", tel=" + tel + ", kind=" + kind + ", rev_dt=" + rev_dt
				+ ", certification=" + certification + ", ck=" + ck + "]";
	}
	
}
