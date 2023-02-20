package model;

public class StoreDto {

	String store_nm;
	String cash;
	String card;
	String total;
	
	public StoreDto() {
		// TODO Auto-generated constructor stub
	}

	public StoreDto(String store_nm, String cash, String card, String total) {
		super();
		this.store_nm = store_nm;
		this.cash = cash;
		this.card = card;
		this.total = total;
	}

	public String getStore_nm() {
		return store_nm;
	}

	public void setStore_nm(String store_nm) {
		this.store_nm = store_nm;
	}

	public String getCash() {
		return cash;
	}

	public void setCash(String cash) {
		this.cash = cash;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "StoreDto [store_nm=" + store_nm + ", cash=" + cash + ", card=" + card + ", total=" + total + "]";
	}
	
}
