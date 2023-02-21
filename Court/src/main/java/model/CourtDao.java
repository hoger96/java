package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CourtDao {

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
	
	public void insert(RegDto dto) {
		dbCon();
		String sql = " insert into tbl_reservation_202301 values(?,?,?,?) ";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, dto.getResv_no());
			pst.setString(2, dto.getResv_date());
			pst.setString(3, dto.getCust_no());
			pst.setString(4, dto.getCourt_no());
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public CourtDto selectCourt(String cust_no) {
		dbCon();
		String sql = " select c.cust_no, c.cust_name, "
				+ " substr(r.resv_date,1,4)||'년 '||substr(r.resv_date,5,2)||'월 '||substr(r.resv_date,7,2)||'일' , "
				+ " r.court_no, c.tel "
				+ " from tbl_reservation_202301 r "
				+ " join tbl_cust_202301 c "
				+ " on r.cust_no = c.cust_no "
				+ " where c.cust_no=? ";
		CourtDto dto = new CourtDto();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, cust_no);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				dto.setCust_no(rs.getString(1));
				dto.setCust_name(rs.getString(2));
				dto.setResv_date(rs.getString(3));
				dto.setCourt_no(rs.getString(4));
				dto.setTel(rs.getString(5));
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
	
	public ArrayList<UserDto> selectUser(){
		dbCon();
		String sql = " select c.cust_no, c.cust_name, count(r.cust_no) "
				+ " from tbl_reservation_202301 r "
				+ " join tbl_cust_202301 c "
				+ " on r.cust_no = c.cust_no "
				+ " group by c.cust_no,c.cust_name "
				+ " order by c.cust_no ";
		ArrayList<UserDto> list = new ArrayList<>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				UserDto dto = new UserDto();
				
				dto.setCust_no(rs.getString(1));
				dto.setCust_name(rs.getString(2));
				dto.setCount(rs.getString(3));
				
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
	
	public static void main(String[] args) {
		CourtDao dao = new CourtDao();
		String cust_no = "1001";
		CourtDto dto = dao.selectCourt(cust_no);
		System.out.println(dto);
	}
}
