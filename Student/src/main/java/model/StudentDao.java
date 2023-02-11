package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDao {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "system";
	String password = "1234";
	
	Connection con = null;
	
	private void dbCon() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
			if(con != null){
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
	
	public ArrayList<StudentDto> selectStudent(){
		dbCon();
		String sql = " select id, name, substr(id,1,1), "
				+ " substr(id,2,2), substr(id,4,2), "
				+ " gender "
				+ " from member_tbl ";
		ArrayList<StudentDto> list = new ArrayList<>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				StudentDto dto = new StudentDto();
				
				dto.setId(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setGrade(rs.getString(3));
				dto.setWclass(rs.getString(4));
				dto.setNum(rs.getString(5));
				dto.setGender(rs.getString(6));
				
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
	
	public void insert(ScoreDto dto) {
		dbCon();
		String sql = "insert into score_tbl values(?,?,?,?,?)";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, dto.getId());
			pst.setString(2, dto.getKorean());
			pst.setString(3, dto.getEnglish());
			pst.setString(4, dto.getMath());
			pst.setString(5, dto.getHistory());
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<SSlistDto> selectmy(){
		dbCon();
		String sql = " select m.id, m.name, substr(m.id,1,1) as grade, "
				+ " substr(m.id,2,2) as wclass, substr(m.id,4,2) as num, "
				+ " m.gender, s.korean, s.math, s.english, s.history, "
				+ " (korean+math+english+history) as sum, "
				+ " round((korean+math+english+history)/4,1) as avg, "
				+ " rank() OVER (ORDER BY round((korean+math+english+history)/4,1) DESC) as rank "
				+ " from member_tbl m "
				+ " join score_tbl s "
				+ " on m.id = s.id ";
		ArrayList<SSlistDto> list = new ArrayList<>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				SSlistDto dto = new SSlistDto();
				
				dto.setId(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setGrade(rs.getString(3));
				dto.setWclass(rs.getString(4));
				dto.setNum(rs.getString(5));
				dto.setGender(rs.getString(6));
				dto.setKorean(rs.getString(7));
				dto.setMath(rs.getString(8));
				dto.setEnglish(rs.getString(9));
				dto.setHistory(rs.getString(10));
				dto.setSum(rs.getString(11));
				dto.setAvg(rs.getString(12));
				dto.setRank(rs.getString(13));
				
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
	
	public TotalDto selectTotal(){
		dbCon();
		String sql = " select sum(korean), sum(math), sum(english), sum(history), "
				+ " avg(korean), avg(math), avg(english), avg(history) "
				+ " from score_tbl ";
		TotalDto dto = null;
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				dto = new TotalDto();
				
				dto.setSumk(rs.getString(1));
				dto.setSumm(rs.getString(2));
				dto.setSume(rs.getString(3));
				dto.setSumh(rs.getString(4));
				dto.setAvgk(rs.getString(5));
				dto.setAvgm(rs.getString(6));
				dto.setAvge(rs.getString(7));
				dto.setAvgh(rs.getString(8));
				
			}
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}
	
	public static void main(String[] args) {
		
	}
}
