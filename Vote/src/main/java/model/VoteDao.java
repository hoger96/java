package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VoteDao {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "system";
	String password = "1234";
	
	Connection con = null;
	
	private void dbCon() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
			if( con != null) {
				System.out.println("연결성공");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<VoterListDto> selectVoterList(){
		
		dbCon();
		String sql = " select v_name, "
				+ " '19'||substr(v_jumin,1,2)||'년'||substr(v_jumin,3,2)||'월'||substr(v_jumin,5,2)||'일' as birth, "
				+ " case when (substr(v_jumin,3,2)) > to_char(sysdate,'mm') then to_char(sysdate,'yyyy')-('19'||substr(v_jumin,1,2))-1 "
				+ "      else to_char(sysdate,'yyyy')-('19'||substr(v_jumin,1,2)) "
				+ "      end age, "
				+ " decode(substr(v_jumin,7,1),'1','남자','2','여자') as gender, "
				+ " v_area, decode(v_confirm,'y','확인','n','미확인') as confirm "
				+ " from tbl_vote ";
		ArrayList<VoterListDto> list = new ArrayList<>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				VoterListDto dto = new VoterListDto();
				
				dto.setV_name(rs.getString(1));
				dto.setV_jumin(rs.getString(2));
				dto.setAge(rs.getString(3));
				dto.setGender(rs.getString(4));
				dto.setV_area(rs.getString(5));
				dto.setV_confirm(rs.getString(6));
				
				list.add(dto);
			}
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<CountVoteDto> selectVoteList(){
		
		dbCon();
		String sql = " select m.n_no, m.n_name, count(v.n_no) "
				+ " from tbl_member m "
				+ " join tbl_vote v "
				+ " on m.n_no = v.n_no "
				+ " where v.v_confirm = 'y' "
				+ " group by  m.n_no, m.n_name "
				+ " order by n_no";
		ArrayList<CountVoteDto> list = new ArrayList<>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				CountVoteDto dto = new CountVoteDto();
				
				dto.setN_no(rs.getString(1));
				dto.setN_name(rs.getString(2));
				dto.setVote(rs.getString(3));
				
				list.add(dto);
			}
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public ArrayList<MemberDto> selectMemberList(){
		
		dbCon();
		String sql = " select m.n_no, m.n_name, substr(m.n_jumin,1,6)||'-'||substr(m.n_jumin,7,6) as jumin, "
				+ " decode (m.n_degree,'01','고졸','02','학사','03','석사','04','박사') as degree, "
				+ " p.p_no, p.p_tel1||'-'||p.p_tel2||'-'||p.p_tel3 as tel "
				+ " from tbl_member m "
				+ " join tbl_party p "
				+ " on m.p_no = p.p_no ";
		ArrayList<MemberDto> list = new ArrayList<>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				MemberDto dto = new MemberDto();
				
				dto.setN_no(rs.getString(1));
				dto.setN_name(rs.getString(2));
				dto.setN_jumin(rs.getString(3));
				dto.setN_degree(rs.getString(4));
				dto.setP_no(rs.getString(5));
				dto.setP_tel(rs.getString(6));
				
				list.add(dto);
			}
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public void insert(RegDto dto) {
		
		dbCon();
		String sql = " insert into tbl_vote values(?,?,?,?,?,?) ";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, dto.getV_jumin());
			pst.setString(2, dto.getV_name());
			pst.setString(3, dto.getV_area());
			pst.setString(4, dto.getV_time());
			pst.setString(5, dto.getV_confirm());
			pst.setString(6, dto.getN_no());
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
