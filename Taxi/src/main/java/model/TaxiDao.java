package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TaxiDao {

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
		String sql = " select substr(c.tel,1,3)||'-'||substr(c.tel,4,4)||'-'||substr(c.tel,8,4) as tell, "
				+ " ca.regno, "
				+ " substr(lpad(ca.regtime,4,0),1,2)||':'||substr(lpad(ca.regtime,4,0),3,2), "
				+ " to_char(ca.regdate,'yyyy-mm-dd'), "
				+ " c.name,ca.startpoint,ca.destination,ca.taxino, "
				+ " decode(ca.state,'P','배차완료','R','배차준비','X','배차미정') "
				+ " from tblcall_list ca "
				+ " join tblcust c "
				+ " on ca.cusno = c.id ";
		ArrayList<ListDto> list = new ArrayList<>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				ListDto dto = new ListDto();
				
				dto.setTel(rs.getString(1));
				dto.setRegno(rs.getString(2));
				dto.setRegtime(rs.getString(3));
				dto.setRegdate(rs.getString(4));
				dto.setName(rs.getString(5));
				dto.setStartpoint(rs.getString(6));
				dto.setDestination(rs.getString(7));
				dto.setTaxino(rs.getString(8));
				dto.setState(rs.getString(9));
				
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
	
	public void insert(RegDto dto ) {
		dbCon();
		String sql = "insert into tblcall_list values(?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, dto.getRegno());
			pst.setString(2, dto.getRegtime());
			pst.setString(3, dto.getRegdate());
			pst.setString(4, dto.getCusno());
			pst.setString(5, dto.getStartpoint());
			pst.setString(6, dto.getDestination());
			pst.setString(7, dto.getTaxino());
			pst.setString(8, dto.getState());
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public RegDto selectRegno(String regno) {
		dbCon();
		String sql = " select regno, lpad(regtime,4,0), to_char(regdate,'yyyymmdd'), cusno, startpoint, destination, taxino, state "
					+ " from tblcall_list "
					+ " where regno = ? ";
		RegDto dto = new RegDto();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, regno);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				dto.setRegno(rs.getString(1));
				dto.setRegtime(rs.getString(2));
				dto.setRegdate(rs.getString(3));
				dto.setCusno(rs.getString(4));
				dto.setStartpoint(rs.getString(5));
				dto.setDestination(rs.getString(6));
				dto.setTaxino(rs.getString(7));
				dto.setState(rs.getString(8));
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
	
	public void update(RegDto dto) {
		dbCon();
		String sql = " update tblcall_list "
					+ " set regtime=?, regdate=?, cusno=?, startpoint=?, destination=?, taxino=?, state=? "
					+ " where regno = ? ";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, dto.getRegtime());
			pst.setString(2, dto.getRegdate());
			pst.setString(3, dto.getCusno());
			pst.setString(4, dto.getStartpoint());
			pst.setString(5, dto.getDestination());
			pst.setString(6, dto.getTaxino());
			pst.setString(7, dto.getState());
			pst.setString(8, dto.getRegno());
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		
	}
}
