package model;

public class VoterListDto {

	String v_name;
	String v_jumin;
	String age;
	String gender;
	String v_area;
	String v_confirm;
	
	public VoterListDto() {
		// TODO Auto-generated constructor stub
	}

	public VoterListDto(String v_name, String v_jumin, String age, String gender, String v_area, String v_confirm) {
		super();
		this.v_name = v_name;
		this.v_jumin = v_jumin;
		this.age = age;
		this.gender = gender;
		this.v_area = v_area;
		this.v_confirm = v_confirm;
	}

	public String getV_name() {
		return v_name;
	}

	public void setV_name(String v_name) {
		this.v_name = v_name;
	}

	public String getV_jumin() {
		return v_jumin;
	}

	public void setV_jumin(String v_jumin) {
		this.v_jumin = v_jumin;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getV_area() {
		return v_area;
	}

	public void setV_area(String v_area) {
		this.v_area = v_area;
	}

	public String getV_confirm() {
		return v_confirm;
	}

	public void setV_confirm(String v_confirm) {
		this.v_confirm = v_confirm;
	}

	@Override
	public String toString() {
		return "VoterListDto [v_name=" + v_name + ", v_jumin=" + v_jumin + ", age=" + age + ", gender=" + gender
				+ ", v_area=" + v_area + ", v_confirm=" + v_confirm + "]";
	}
	
}
