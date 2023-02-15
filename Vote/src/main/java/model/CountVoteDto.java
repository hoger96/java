package model;

public class CountVoteDto {

	String n_no;
	String n_name;
	String vote;
	
	public CountVoteDto() {
		// TODO Auto-generated constructor stub
	}

	public CountVoteDto(String n_no, String n_name, String vote) {
		super();
		this.n_no = n_no;
		this.n_name = n_name;
		this.vote = vote;
	}

	public String getN_no() {
		return n_no;
	}

	public void setN_no(String n_no) {
		this.n_no = n_no;
	}

	public String getN_name() {
		return n_name;
	}

	public void setN_name(String n_name) {
		this.n_name = n_name;
	}

	public String getVote() {
		return vote;
	}

	public void setVote(String vote) {
		this.vote = vote;
	}

	@Override
	public String toString() {
		return "MemberDto [n_no=" + n_no + ", n_name=" + n_name + ", vote=" + vote + "]";
	}
	
}
