package model;

public class TotalDto {

	String sumk;
	String summ;
	String sume;
	String sumh;
	String avgk;
	String avgm;
	String avge;
	String avgh;
	
	public TotalDto() {
		// TODO Auto-generated constructor stub
	}

	public TotalDto(String sumk, String summ, String sume, String sumh, String avgk, String avgm, String avge,
			String avgh) {
		super();
		this.sumk = sumk;
		this.summ = summ;
		this.sume = sume;
		this.sumh = sumh;
		this.avgk = avgk;
		this.avgm = avgm;
		this.avge = avge;
		this.avgh = avgh;
	}

	public String getSumk() {
		return sumk;
	}

	public void setSumk(String sumk) {
		this.sumk = sumk;
	}

	public String getSumm() {
		return summ;
	}

	public void setSumm(String summ) {
		this.summ = summ;
	}

	public String getSume() {
		return sume;
	}

	public void setSume(String sume) {
		this.sume = sume;
	}

	public String getSumh() {
		return sumh;
	}

	public void setSumh(String sumh) {
		this.sumh = sumh;
	}

	public String getAvgk() {
		return avgk;
	}

	public void setAvgk(String avgk) {
		this.avgk = avgk;
	}

	public String getAvgm() {
		return avgm;
	}

	public void setAvgm(String avgm) {
		this.avgm = avgm;
	}

	public String getAvge() {
		return avge;
	}

	public void setAvge(String avge) {
		this.avge = avge;
	}

	public String getAvgh() {
		return avgh;
	}

	public void setAvgh(String avgh) {
		this.avgh = avgh;
	}

	@Override
	public String toString() {
		return "TotalDto [sumk=" + sumk + ", summ=" + summ + ", sume=" + sume + ", sumh=" + sumh + ", avgk=" + avgk
				+ ", avgm=" + avgm + ", avge=" + avge + ", avgh=" + avgh + "]";
	}
	
}
