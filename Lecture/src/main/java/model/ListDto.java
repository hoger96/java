package model;

public class ListDto {
	
	String s_id;
	String s_name;
	String s_grade;
	String t_name;
	String weekday;
	String start_h;
	String end_h;
	
	public ListDto() {
		// TODO Auto-generated constructor stub
	}

	public ListDto(String s_id, String s_name, String s_grade, String t_name, String weekday, String start_h,
			String end_h) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_grade = s_grade;
		this.t_name = t_name;
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

	public String getS_grade() {
		return s_grade;
	}

	public void setS_grade(String s_grade) {
		this.s_grade = s_grade;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
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
		return "ListDto [s_id=" + s_id + ", s_name=" + s_name + ", s_grade=" + s_grade + ", t_name=" + t_name
				+ ", weekday=" + weekday + ", start_h=" + start_h + ", end_h=" + end_h + "]";
	}
	
	
}
