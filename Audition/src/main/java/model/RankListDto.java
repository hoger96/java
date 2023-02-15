package model;

public class RankListDto {

	String join_id;
	String join_nm;
	String score;
	String avg;
	String rank;
	
	public RankListDto() {
		// TODO Auto-generated constructor stub
	}

	public RankListDto(String join_id, String join_nm, String score, String avg, String rank) {
		super();
		this.join_id = join_id;
		this.join_nm = join_nm;
		this.score = score;
		this.avg = avg;
		this.rank = rank;
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

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getAvg() {
		return avg;
	}

	public void setAvg(String avg) {
		this.avg = avg;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "RankListDto [join_id=" + join_id + ", join_nm=" + join_nm + ", score=" + score + ", avg=" + avg
				+ ", rank=" + rank + "]";
	}
	
}
