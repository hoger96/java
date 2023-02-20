package model;

import java.util.ArrayList;

public class GsService {

	GsDao dao;
	
	public GsService() {
		// TODO Auto-generated constructor stub
	}

	public GsService(GsDao dao) {
		super();
		this.dao = dao;
	}
	
	public ArrayList<GoodsDto> selectGoods(){
		return dao.selectGoods();
	}
	
	public void insert(GoodsDto dto) {
		dao.insert(dto);
	}
	
	public SeqDto selectSeq() {
		return dao.selectSeq();
	}
	
	public void update(GoodsDto dto) {
		dao.update(dto);
	}
	
	public GoodsDto selectGoodscd(String goods_cd) {
		return dao.selectGoodscd(goods_cd);
	}
	
	public ArrayList<StoreDto> selectStore(){
		return dao.selectStore();
	}
	
	public ArrayList<SaleDto> selectSale(String store_nm){
		return dao.selectSale(store_nm);
	}
}
