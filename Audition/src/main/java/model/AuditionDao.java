package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AuditionDao {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "system";
	String password = "1234";
	
	Connection con = null;
	
	private void dbCon() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
			if(con != null) {
				System.out.print("연결성공");
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insert(PersonDto dto) {
		dbCon();
		String sql = " insert into tbl_join values(?,?,?,?,?,?) ";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, dto.getJoin_id());
			pst.setString(2, dto.getJoin_nm());
			pst.setString(3, dto.getBirth());
			pst.setString(4, dto.getGender());
			pst.setString(5, dto.getSpecialty());
			pst.setString(6, dto.getCharm());
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<PersonListDto> selectPersonList(){
		
		dbCon();
		String sql = " select join_id, join_nm, substr(birth,1,4)||'년'||substr(birth,5,2)||'월'||substr(birth,7,2)||'일', "
				+ " decode(gender,'M','남성','F','여성'), "
				+ " decode(specialty,'D','댄스','V','보컬','R','랩'),charm "
				+ " from tbl_join ";
		ArrayList<PersonListDto> list = new ArrayList<>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				PersonListDto dto = new PersonListDto();
				
				dto.setJoin_id(rs.getString(1));
				dto.setJoin_nm(rs.getString(2));
				dto.setBirth(rs.getString(3));
				dto.setGender(rs.getString(4));
				dto.setSpecialty(rs.getString(5));
				dto.setCharm(rs.getString(6));
				
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
	
	public ArrayList<ScoreListDto> selectScoreList(){
		
		dbCon();
		String sql = " select s.score_no, j.join_id, j.join_nm, j.birth, s.score, "
				+ " case when s.score>=90 then 'A' "
				+ "      when s.score>=80 then 'B' "
				+ "      when s.score>=70 then 'C' "
				+ "      else 'D' "
				+ "      end as grade, "
				+ " decode(s.mentorid, 'J001','박진영','J002','박재상','J003','보아') "
				+ " from tbl_join j "
				+ " join tbl_score s "
				+ " on j.join_id = s.artistid ";
		ArrayList<ScoreListDto> list = new ArrayList<>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				ScoreListDto dto = new ScoreListDto();
				
				dto.setScore_no(rs.getString(1));
				dto.setJoin_id(rs.getString(2));
				dto.setJoin_nm(rs.getString(3));
				dto.setBirth(rs.getString(4));
				dto.setScore(rs.getString(5));
				dto.setGrade(rs.getString(6));
				dto.setMentor_nm(rs.getString(7));
				
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
	
	public ArrayList<RankListDto> selectRankList(){
		dbCon();
		String sql = " select join_id, join_nm, sum(score),round(avg(score),2),rank() OVER (ORDER BY sum(score) DESC) "
				+ " from tbl_join j "
				+ " join tbl_score s "
				+ " on j.join_id = s.artistid "
				+ " group by join_id,join_nm ";
		ArrayList<RankListDto> list = new ArrayList<>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				RankListDto dto = new RankListDto();
				
				dto.setJoin_id(rs.getString(1));
				dto.setJoin_nm(rs.getString(2));
				dto.setScore(rs.getString(3));
				dto.setAvg(rs.getString(4));
				dto.setRank(rs.getString(5));
				
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
}
