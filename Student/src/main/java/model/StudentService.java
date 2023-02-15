package model;

import java.util.ArrayList;

public class StudentService {

	StudentDao dao;
	public StudentService() {
		// TODO Auto-generated constructor stub
	}
	public StudentService(StudentDao dao) {
		super();
		this.dao = dao;
	}
	
	public ArrayList<StudentDto> selectStudent(){
		return dao.selectStudent();
	}
	
	public void insert(ScoreDto dto) {
		dao.insert(dto);
	}
	
	public ArrayList<SSlistDto> selectmy(){
		return dao.selectmy();
	}
	
	public TotalDto selectTotal(){
		return dao.selectTotal();
	}
}
