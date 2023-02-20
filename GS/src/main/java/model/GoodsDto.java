package model;

public class GoodsDto {

	String goods_cd;
	String goods_nm;
	String price;
	String cose;
	String in_date;
	
	public GoodsDto() {
		// TODO Auto-generated constructor stub
	}

	public GoodsDto(String goods_cd, String goods_nm, String price, String cose, String in_date) {
		super();
		this.goods_cd = goods_cd;
		this.goods_nm = goods_nm;
		this.price = price;
		this.cose = cose;
		this.in_date = in_date;
	}

	public String getGoods_cd() {
		return goods_cd;
	}

	public void setGoods_cd(String goods_cd) {
		this.goods_cd = goods_cd;
	}

	public String getGoods_nm() {
		return goods_nm;
	}

	public void setGoods_nm(String goods_nm) {
		this.goods_nm = goods_nm;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCose() {
		return cose;
	}

	public void setCose(String cose) {
		this.cose = cose;
	}

	public String getIn_date() {
		return in_date;
	}

	public void setIn_date(String in_date) {
		this.in_date = in_date;
	}

	@Override
	public String toString() {
		return "GoodsDto [goods_cd=" + goods_cd + ", goods_nm=" + goods_nm + ", price=" + price + ", cose=" + cose
				+ ", in_date=" + in_date + "]";
	}
	
	
}
