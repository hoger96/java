package model;

import java.util.ArrayList;

public class TaxiService {

	TaxiDao dao;
	
	public TaxiService() {
		// TODO Auto-generated constructor stub
	}

	public TaxiService(TaxiDao dao) {
		super();
		this.dao = dao;
	}
	
	public ArrayList<ListDto> selectList(){
		return dao.selectList();
	}
	
	public void insert(RegDto dto ) {
		dao.insert(dto);
	}
	
	public RegDto selectRegno(String regno) {
		return dao.selectRegno(regno);
	}
	
	public void update(RegDto dto) {
		dao.update(dto);
	}
}
