package model;

public class RegDto {

	String s_id;
	String s_name;
	String t_id;
	String s_grade;
	String weekday;
	String start_h;
	String end_h;
	
	public RegDto() {
		// TODO Auto-generated constructor stub
	}

	public RegDto(String s_id, String s_name, String t_id, String s_grade, String weekday, String start_h,
			String end_h) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.t_id = t_id;
		this.s_grade = s_grade;
		this.weekday = weekday;
		this.start_h = start_h;
		this.end_h = end_h;
	}

	public String getS_id() {
		return s_id;
	}

	public void setS_id(String s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getT_id() {
		return t_id;
	}

	public void setT_id(String t_id) {
		this.t_id = t_id;
	}

	public String getS_grade() {
		return s_grade;
	}

	public void setS_grade(String s_grade) {
		this.s_grade = s_grade;
	}

	public String getWeekday() {
		return weekday;
	}

	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}

	public String getStart_h() {
		return start_h;
	}

	public void setStart_h(String start_h) {
		this.start_h = start_h;
	}

	public String getEnd_h() {
		return end_h;
	}

	public void setEnd_h(String end_h) {
		this.end_h = end_h;
	}

	@Override
	public String toString() {
		return "RegDto [s_id=" + s_id + ", s_name=" + s_name + ", t_id=" + t_id + ", s_grade=" + s_grade + ", weekday="
				+ weekday + ", start_h=" + start_h + ", end_h=" + end_h + "]";
	}
	
}
