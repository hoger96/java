package model;

public class SeqDto {

	String seq;
	public SeqDto() {
		// TODO Auto-generated constructor stub
	}
	public SeqDto(String seq) {
		super();
		this.seq = seq;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	@Override
	public String toString() {
		return "SeqDto [seq=" + seq + "]";
	}
	
}
