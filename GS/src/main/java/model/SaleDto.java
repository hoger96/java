package model;

public class SaleDto {

	String sale_fg;
	String sale_no;
	String in_date;
	String goods_nm;
	String sale_cnt;
	String price;
	String pay_type;
	
	public SaleDto() {
		// TODO Auto-generated constructor stub
	}

	public SaleDto(String sale_fg, String sale_no, String in_date, String goods_nm, String sale_cnt, String price,
			String pay_type) {
		super();
		this.sale_fg = sale_fg;
		this.sale_no = sale_no;
		this.in_date = in_date;
		this.goods_nm = goods_nm;
		this.sale_cnt = sale_cnt;
		this.price = price;
		this.pay_type = pay_type;
	}

	public String getSale_fg() {
		return sale_fg;
	}

	public void setSale_fg(String sale_fg) {
		this.sale_fg = sale_fg;
	}

	public String getSale_no() {
		return sale_no;
	}

	public void setSale_no(String sale_no) {
		this.sale_no = sale_no;
	}

	public String getIn_date() {
		return in_date;
	}

	public void setIn_date(String in_date) {
		this.in_date = in_date;
	}

	public String getGoods_nm() {
		return goods_nm;
	}

	public void setGoods_nm(String goods_nm) {
		this.goods_nm = goods_nm;
	}

	public String getSale_cnt() {
		return sale_cnt;
	}

	public void setSale_cnt(String sale_cnt) {
		this.sale_cnt = sale_cnt;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPay_type() {
		return pay_type;
	}

	public void setPay_type(String pay_type) {
		this.pay_type = pay_type;
	}

	@Override
	public String toString() {
		return "SaleDto [sale_fg=" + sale_fg + ", sale_no=" + sale_no + ", in_date=" + in_date + ", goods_nm="
				+ goods_nm + ", sale_cnt=" + sale_cnt + ", price=" + price + ", pay_type=" + pay_type + "]";
	}
	
	
	
}
