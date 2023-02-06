package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LectureDao {

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
	
	public ArrayList<ListDto> selectList(){
		
		dbCon();
		String sql = " select c.s_id, c.s_name, c.s_grade,l.t_name, "
				+ " decode(trim(c.weekday),'M','월','TU','화','W','수','TH','목','F','금','S','토'), "
				+ " substr(lpad(start_h,4,0),1,2)||':'||substr(lpad(start_h,4,0),3,4), "
				+ " substr(end_h,1,2)||':'||substr(end_h,3,4) "
				+ " from tbl_course c "
				+ " join tbl_lecturer l "
				+ " on c.teacher_id = l.t_id ";
		
		ArrayList<ListDto> list = new ArrayList<>();
		
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				ListDto dto = new ListDto();
				
				dto.setS_id(rs.getString(1));
				dto.setS_name(rs.getString(2));
				dto.setS_grade(rs.getString(3));
				dto.setT_name(rs.getString(4));
				dto.setWeekday(rs.getString(5));
				dto.setStart_h(rs.getString(6));
				dto.setEnd_h(rs.getString(7));
				
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
		String sql = " insert into tbl_course values(?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, dto.getS_id());
			pst.setString(2, dto.getS_name());
			pst.setString(3, dto.getS_grade());
			pst.setString(4, dto.getT_id());
			pst.setString(5, dto.getWeekday());
			pst.setString(6, dto.getStart_h());
			pst.setString(7, dto.getEnd_h());
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public LectureDto selectId(String s_id) {
		
		dbCon();
		String sql = "select s_id, s_name, teacher_id, s_grade, weekday, lpad(start_h,4,0), end_h "
				+ " from tbl_course "
				+ " where s_id=? ";
		
		LectureDto dto = null;
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, s_id);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				dto = new LectureDto();
				dto.setS_id(rs.getString(1));
				dto.setS_name(rs.getString(2));
				dto.setT_id(rs.getString(3));
				dto.setS_grade(rs.getString(4));
				dto.setWeekday(rs.getString(5));
				dto.setStart_h(rs.getString(6));
				dto.setEnd_h(rs.getString(7));
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
	
	public void lectureUpdate(ModifyDto dto) {
		
		dbCon();
		String sql = " update tbl_course"
					+ " set s_name=?, s_grade=?, teacher_id=?, weekday=?, start_h=?, end_h=? "
					+ " where s_id=? ";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, dto.getS_name());
			pst.setString(2, dto.getS_grade());
			pst.setString(3, dto.getT_id());
			pst.setString(4, dto.getWeekday());
			pst.setString(5, dto.getStart_h());
			pst.setString(6, dto.getEnd_h());
			pst.setString(7, dto.getS_id());
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
