package model;

public class Review {
	
	String title;
	String review;
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	@Override
	public String toString() {
		return "Review [title=" + title + ", review=" + review + "]";
	}	

	
	
}
