package model;

public class StudentDto {

	String id;
	String name;
	String grade;
	String wclass;
	String num;
	String gender;
	
	public StudentDto() {
		// TODO Auto-generated constructor stub
	}

	public StudentDto(String id, String name, String grade, String wclass, String num, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.wclass = wclass;
		this.num = num;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getWclass() {
		return wclass;
	}

	public void setWclass(String wclass) {
		this.wclass = wclass;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", grade=" + grade + ", wclass=" + wclass + ", num=" + num
				+ ", gender=" + gender + "]";
	}
	
}
