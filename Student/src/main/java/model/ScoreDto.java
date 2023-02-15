package model;

public class ScoreDto {

	String id;
	String korean;
	String english;
	String math;
	String history;
	public ScoreDto() {
		// TODO Auto-generated constructor stub
	}
	public ScoreDto(String id, String korean, String english, String math, String history) {
		super();
		this.id = id;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.history = history;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getKorean() {
		return korean;
	}
	public void setKorean(String korean) {
		this.korean = korean;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getMath() {
		return math;
	}
	public void setMath(String math) {
		this.math = math;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	@Override
	public String toString() {
		return "ScoreDto [id=" + id + ", korean=" + korean + ", english=" + english + ", math=" + math + ", history="
				+ history + "]";
	}
	
}
