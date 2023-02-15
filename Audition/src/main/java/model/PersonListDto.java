package model;

public class PersonListDto {

	String join_id;
	String join_nm;
	String birth;
	String gender;
	String specialty;
	String charm;
	
	public PersonListDto() {
		// TODO Auto-generated constructor stub
	}

	public PersonListDto(String join_id, String join_nm, String birth, String gender, String specialty, String charm) {
		super();
		this.join_id = join_id;
		this.join_nm = join_nm;
		this.birth = birth;
		this.gender = gender;
		this.specialty = specialty;
		this.charm = charm;
	}

	public String getJoin_id() {
		return join_id;
	}

	public void setJoin_id(String join_id) {
		this.join_id = join_id;
	}

	public String getJoin_nm() {
		return join_nm;
	}

	public void setJoin_nm(String join_nm) {
		this.join_nm = join_nm;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getCharm() {
		return charm;
	}

	public void setCharm(String charm) {
		this.charm = charm;
	}

	@Override
	public String toString() {
		return "PersonListDto [join_id=" + join_id + ", join_nm=" + join_nm + ", birth=" + birth + ", gender=" + gender
				+ ", specialty=" + specialty + ", charm=" + charm + "]";
	}
	
}
