package model;

import java.util.ArrayList;

public class LectureService {

	LectureDao dao;
	
	public LectureService() {
		// TODO Auto-generated constructor stub
	}

	public LectureService(LectureDao dao) {
		super();
		this.dao = dao;
	}
	
	public ArrayList<ListDto> selectList(){
		return dao.selectList();
	}
	
	public void insert(RegDto dto) {
		dao.insert(dto);
	}
	
	public void lectureUpdate(ModifyDto dto) {
		dao.lectureUpdate(dto);
	}
	
	public LectureDto selectId(String s_id) {
		return dao.selectId(s_id);
	}
}
