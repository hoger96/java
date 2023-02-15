package model;

public class ScoreListDto {

	String score_no;
	String join_id;
	String join_nm;
	String birth;
	String score;
	String grade;
	String mentor_nm;
	
	public ScoreListDto() {
		// TODO Auto-generated constructor stub
	}

	public ScoreListDto(String score_no, String join_id, String join_nm, String birth, String score, String grade,
			String mentor_nm) {
		super();
		this.score_no = score_no;
		this.join_id = join_id;
		this.join_nm = join_nm;
		this.birth = birth;
		this.score = score;
		this.grade = grade;
		this.mentor_nm = mentor_nm;
	}

	public String getScore_no() {
		return score_no;
	}

	public void setScore_no(String score_no) {
		this.score_no = score_no;
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

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getMentor_nm() {
		return mentor_nm;
	}

	public void setMentor_nm(String mentor_nm) {
		this.mentor_nm = mentor_nm;
	}

	@Override
	public String toString() {
		return "ScoreListDto [score_no=" + score_no + ", join_id=" + join_id + ", join_nm=" + join_nm + ", birth="
				+ birth + ", score=" + score + ", grade=" + grade + ", mentor_nm=" + mentor_nm + "]";
	}
	
}
