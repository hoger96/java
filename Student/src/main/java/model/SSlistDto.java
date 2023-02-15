package model;

public class SSlistDto {

	String id;
	String name;
	String grade;
	String wclass;
	String num;
	String gender;
	String korean;
	String math;
	String english;
	String history;
	String sum;
	String avg;
	String rank;

	public SSlistDto() {
		// TODO Auto-generated constructor stub
	}
	public SSlistDto(String id, String name, String grade, String wclass, String num, String gender, String korean,
			String math, String english, String history, String sum, String avg, String rank, String allsum,
			String allavg) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.wclass = wclass;
		this.num = num;
		this.gender = gender;
		this.korean = korean;
		this.math = math;
		this.english = english;
		this.history = history;
		this.sum = sum;
		this.avg = avg;
		this.rank = rank;

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
	public String getKorean() {
		return korean;
	}
	public void setKorean(String korean) {
		this.korean = korean;
	}
	public String getMath() {
		return math;
	}
	public void setMath(String math) {
		this.math = math;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	public String getSum() {
		return sum;
	}
	public void setSum(String sum) {
		this.sum = sum;
	}
	public String getAvg() {
		return avg;
	}
	public void setAvg(String avg) {
		this.avg = avg;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "SSlistDto [id=" + id + ", name=" + name + ", grade=" + grade + ", wclass=" + wclass + ", num=" + num
				+ ", gender=" + gender + ", korean=" + korean + ", math=" + math + ", english=" + english + ", history="
				+ history + ", sum=" + sum + ", avg=" + avg + ", rank=" + rank + "]";
	}
	
}
