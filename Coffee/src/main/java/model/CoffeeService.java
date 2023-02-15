package model;

import java.util.ArrayList;

public class CoffeeService {

	CoffeeDao dao;
	
	public CoffeeService() {
		// TODO Auto-generated constructor stub
	}
	
	public CoffeeService(CoffeeDao dao) {
		super();
		this.dao = dao;
	}
	
	public void insert(RegDto dto) {
		dao.insert(dto);
	}
	
	public SequenceDto selectSeq() {
		return dao.selectSeq();
	}
	
	public ArrayList<SalelistDto> selectSaleList(){
		return dao.selectSaleList();
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
	
	public SalelistDto selectInfo(String saleno) {
		return dao.selectInfo(saleno);
	}
}
