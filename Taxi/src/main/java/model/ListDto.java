package model;

public class ListDto {

	String tel;
	String regno;
	String regtime;
	String regdate;
	String name;
	String startpoint;
	String destination;
	String taxino;
	String state;
	
	public ListDto() {
		// TODO Auto-generated constructor stub
	}

	public ListDto(String tel, String regno, String regtime, String regdate, String name, String startpoint,
			String destination, String taxino, String state) {
		super();
		this.tel = tel;
		this.regno = regno;
		this.regtime = regtime;
		this.regdate = regdate;
		this.name = name;
		this.startpoint = startpoint;
		this.destination = destination;
		this.taxino = taxino;
		this.state = state;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getRegno() {
		return regno;
	}

	public void setRegno(String regno) {
		this.regno = regno;
	}

	public String getRegtime() {
		return regtime;
	}

	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStartpoint() {
		return startpoint;
	}

	public void setStartpoint(String startpoint) {
		this.startpoint = startpoint;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getTaxino() {
		return taxino;
	}

	public void setTaxino(String taxino) {
		this.taxino = taxino;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "ListDto [tel=" + tel + ", regno=" + regno + ", regtime=" + regtime + ", regdate=" + regdate + ", name="
				+ name + ", startpoint=" + startpoint + ", destination=" + destination + ", taxino=" + taxino
				+ ", state=" + state + "]";
	}
	
}
