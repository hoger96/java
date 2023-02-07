package model;

import java.util.ArrayList;

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
	
	public ArrayList<PersonListDto> selectPersonList(){
		return dao.selectPersonList();
	}
	
	public ArrayList<ScoreListDto> selectScoreList(){
		return dao.selectScoreList();
	}
	
	public ArrayList<RankListDto> selectRankList(){
		return dao.selectRankList();
	}
}
