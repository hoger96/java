package model;

import java.util.ArrayList;

public class CarService {

	CarDao dao;
	
	public CarService() {
		// TODO Auto-generated constructor stub
	}

	public CarService(CarDao dao) {
		super();
		this.dao = dao;
	}
	
	public void insert(NewRegDto dto) {
		dao.insert(dto);
	}
	
	public void inserBuy(BuyerDto dto) {
		dao.inserBuy(dto);
	}
	
	public ArrayList<SaleonDto> selectSaleon(){
		return dao.selectSaleon();
	}
	
	public CheckDto selectCode(String l_code) {
		return dao.selectCode(l_code);
	}
	
	public ArrayList<SoldoutDto> selectSoldout(){
		return dao.selectSoldout();
	}
	
	public ArrayList<SortDto> selectSort(){
		return dao.selectSort();
	}
	
	public void updateChecklist(CheckDto dto) {
		dao.updateChecklist(dto);
	}
}

