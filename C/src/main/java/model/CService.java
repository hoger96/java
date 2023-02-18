package model;

import java.util.ArrayList;

public class CService {

	CDao dao;
	public CService() {
		// TODO Auto-generated constructor stub
	}
	public CService(CDao dao) {
		super();
		this.dao = dao;
	}
	
	public void insert(RegDto dto) {
		dao.insert(dto);
	}
	
	public SeqDto selectSeq() {
		return dao.selectSeq();
	}
	
	public ArrayList<SaleDto> selectSalelist(){
		return dao.selectSalelist();
	}
	
	public ArrayList<StoreDto> selectStore(){
		return dao.selectStore();
	}
	
	public ArrayList<ProductDto> selectProduct(){
		return dao.selectProduct();
	}
	
	public RegDto selectSaleno(String saleno) {
		return dao.selectSaleno(saleno);
	}
	
	public void update(RegDto dto) {
		dao.update(dto);
	}
	
	public void delete(String saleno) {
		dao.delete(saleno);
	}
	
	public SaleDto selectOne(String saleno) {
		return dao.selectOne(saleno);
	}
}
