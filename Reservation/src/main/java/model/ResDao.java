package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ResDao {

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
		String sql = " insert into tbl_reservation values(?,?,?,?,?,?) ";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, dto.getRev_id());
			pst.setString(2, dto.getJoin_no());
			pst.setString(3, dto.getKind());
			pst.setString(4, dto.getRev_dt());
			pst.setString(5, dto.getCertification());
			pst.setString(6, dto.getCk());
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public RegDto selectRes(String rev_id) {
		dbCon();
		String sql = " select rev_id, join_no, kind, to_char(rev_dt, 'yyyy-mm-dd'), certification, ck "
					+ " from tbl_reservation "
					+ " where rev_id=? ";
		RegDto dto = new RegDto();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, rev_id);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				dto.setRev_id(rs.getString(1));
				dto.setJoin_no(rs.getString(2));
				dto.setKind(rs.getString(3));
				dto.setRev_dt(rs.getString(4));
				dto.setCertification(rs.getString(5));
				dto.setCk(rs.getString(6));
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
	
	public SeqDto selectSeq() {
		dbCon();
		String sql = " select rev_id.nextval "
					+ " from dual ";
		SeqDto dto = new SeqDto();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				dto.setSeq(rs.getString(1));
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
		String sql = " update tbl_reservation "
					+ " set join_no=?, kind=?, rev_dt=?, certification=?, ck=? "
					+ " where rev_id=? ";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, dto.getJoin_no());
			pst.setString(2, dto.kind);
			pst.setString(3, dto.getRev_dt());
			pst.setString(4, dto.getCertification());
			pst.setString(5, dto.getCk());
			pst.setString(6, dto.getRev_id());
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<AreaDto> selectArea(){
		dbCon();
		String sql = " select decode(j.region,'K','경기','P','부산','S','서울'), count(r.ck) "
				+ " from tbl_reservation r "
				+ " join tbl_join_12 j "
				+ " on r.join_no = j.id "
				+ " where r.ck = 'Y' "
				+ " group by j.region "
				+ " order by count(r.ck) desc ";
		ArrayList<AreaDto> list = new ArrayList<>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				AreaDto dto = new AreaDto();
				
				dto.setRegion(rs.getString(1));
				dto.setCount(rs.getString(2));
				
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
		ResDao dao = new ResDao();
		String rev_id = "1111";
		RegDto dto = dao.selectRes(rev_id);
		System.out.println(dto);
	}
}
