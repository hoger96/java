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
	
	public ArrayList<SaleDto> selectSalelist(){
		return dao.selectSalelist();
	}
	
	public ArrayList<StoreDto> selectStorelist(){
		return dao.selectStorelist();
	}
	
	public ArrayList<ObjectDto> selectObjectlist(){
		return dao.selectObjectlist();
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
	
	public SequenceDto selectSequence() {
		return dao.selectSequence();
	}
}
