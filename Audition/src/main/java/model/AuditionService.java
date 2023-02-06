package model;

public class AuditionService {

	AuditionDao dao;
	
	public AuditionService() {
		// TODO Auto-generated constructor stub
	}

	public AuditionService(AuditionDao dao) {
		super();
		this.dao = dao;
	}
	
	public void insert(PersonDto dto) {
		dao.insert(dto);
	}
}
