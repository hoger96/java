package model;

public class RegDto {

	String regno;
	String regtime;
	String regdate;
	String cusno;
	String startpoint;
	String destination;
	String taxino;
	String state;
	
	public RegDto() {
		// TODO Auto-generated constructor stub
	}

	public RegDto(String regno, String regtime, String regdate, String cusno, String startpoint, String destination,
			String taxino, String state) {
		super();
		this.regno = regno;
		this.regtime = regtime;
		this.regdate = regdate;
		this.cusno = cusno;
		this.startpoint = startpoint;
		this.destination = destination;
		this.taxino = taxino;
		this.state = state;
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

	public String getCusno() {
		return cusno;
	}

	public void setCusno(String cusno) {
		this.cusno = cusno;
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
		return "RegDto [regno=" + regno + ", regtime=" + regtime + ", regdate=" + regdate + ", cusno=" + cusno
				+ ", startpoint=" + startpoint + ", destination=" + destination + ", taxino=" + taxino + ", state="
				+ state + "]";
	}
	
}
