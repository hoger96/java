package model;

public class AreaDto {

	String region;
	String count;
	
	public AreaDto() {
		// TODO Auto-generated constructor stub
	}

	public AreaDto(String region, String count) {
		super();
		this.region = region;
		this.count = count;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "AreaDto [region=" + region + ", count=" + count + "]";
	}
	
}
