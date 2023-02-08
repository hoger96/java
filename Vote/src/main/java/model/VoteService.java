package model;

import java.util.ArrayList;

public class VoteService {

	VoteDao dao;
	
	public VoteService() {
		// TODO Auto-generated constructor stub
	}

	public VoteService(VoteDao dao) {
		super();
		this.dao = dao;
	}
	
	public ArrayList<VoterListDto> selectVoterList(){
		return dao.selectVoterList();
	}
	
	public ArrayList<CountVoteDto> selectVoteList(){
		return dao.selectVoteList();
	}
	
	public ArrayList<MemberDto> selectMemberList(){
		return dao.selectMemberList();
	}
}
