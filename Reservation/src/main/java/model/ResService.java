package model;

public class ResService {

	ResDao dao;
	public ResService() {
		// TODO Auto-generated constructor stub
	}
	public ResService(ResDao dao) {
		super();
		this.dao = dao;
	}
	
	public void insert(RegDto dto) {
		dao.insert(dto);
	}
}
