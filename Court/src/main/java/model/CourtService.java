package model;

import java.util.ArrayList;

public class CourtService {

	CourtDao dao;
	
	public CourtService() {
		// TODO Auto-generated constructor stub
	}

	public CourtService(CourtDao dao) {
		super();
		this.dao = dao;
	}
	
	public void insert(RegDto dto) {
		dao.insert(dto);
	}
	
	public CourtDto selectCourt(String cust_no) {
		return dao.selectCourt(cust_no);
	}
	
	public ArrayList<UserDto> selectUser(){
		return dao.selectUser();
	}
}
