package model;

public class SequenceDto {

	String sequence;
	
	public SequenceDto() {
		// TODO Auto-generated constructor stub
	}

	public SequenceDto(String sequence) {
		super();
		this.sequence = sequence;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	@Override
	public String toString() {
		return "SequenceDto [sequence=" + sequence + "]";
	}
	
}
