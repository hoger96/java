package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CarDao {

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
	
	public void insert(NewRegDto dto) {
		
		dbCon();
		String sql = "insert into tbl_car_list values(?,?,?,?,?,?)";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, dto.getC_code());
			pst.setString(2, dto.getC_class());
			pst.setString(3, dto.getC_name());
			pst.setString(4, dto.getC_age());
			pst.setString(5, dto.getC_kilo());
			pst.setString(6, dto.getC_price());
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void inserBuy(BuyerDto dto) {
		
		dbCon();
		String sql = "insert into tbl_buyer_list values(?,?,?,?,?)";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, dto.getB_id());
			pst.setString(2, dto.getB_name());
			pst.setString(3, dto.getB_code());
			pst.setString(4, dto.getB_cost());
			pst.setString(5, dto.getB_month());
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<SaleonDto> selectSaleon(){
		
		dbCon();
		String sql = " select l_code, "
				+ " decode(l_tire, '1', '이상무','2','교체필요') as tire, "
				+ " decode(l_int, '1', '이상무','2','교체필요') as inte, "
				+ " decode(l_egr, '1', '이상무','2','교체필요') as egr, "
				+ " decode(l_run, '1', '이상무','2','교체필요') as run, "
				+ " decode(l_sc, '1', '이상무','2','교체필요') as sc "
				+ " from tbl_check_list ";
		ArrayList<SaleonDto> list = new ArrayList<>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				SaleonDto dto = new SaleonDto();
				
				dto.setL_code(rs.getString(1));
				dto.setL_tire(rs.getString(2));
				dto.setL_int(rs.getString(3));
				dto.setL_egr(rs.getString(4));
				dto.setL_run(rs.getString(5));
				dto.setL_sc(rs.getString(6));
				
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
	
	public CheckDto selectCode(String l_code) {
		
		dbCon();
		String sql = " select l_code,l_tire,l_int,l_egr,l_run,l_sc "
				+ " from tbl_check_list "
				+ " where l_code=? ";
		CheckDto dto = new CheckDto();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, l_code);	
			ResultSet rs = pst.executeQuery();
		
			while(rs.next()) {
				dto.setL_code(rs.getString(1));
				dto.setL_tire(rs.getString(2));
				dto.setL_int(rs.getString(3));
				dto.setL_egr(rs.getString(4));
				dto.setL_run(rs.getString(5));
				dto.setL_sc(rs.getString(6));
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
	
	public void updateChecklist(CheckDto dto) {
			
			dbCon();
			String sql = " update tbl_check_list "
					+ " set l_tire=?, l_int=?, l_egr=?,l_run=?,l_se=? "
					+ " where l_code=? ";
			dto = new CheckDto();
			
			try {
				PreparedStatement pst = con.prepareStatement(sql);
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public ArrayList<SoldoutDto> selectSoldout(){
		
		dbCon();
		String sql = " select b_id, b_name, b_code, "
				+ " to_char(b_cost,'9,999')||'만원', "
				+ " b_month||'개월', \r\n"
				+ " round((b_cost/b_month),0)||'만원' "
				+ " from tbl_buyer_list "
				+ " order by b_code asc ";
		ArrayList<SoldoutDto> list = new ArrayList<>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				SoldoutDto dto = new SoldoutDto();
				
				dto.setB_id(rs.getString(1));
				dto.setB_name(rs.getString(2));
				dto.setB_code(rs.getString(3));
				dto.setB_cost(rs.getString(4));
				dto.setB_month(rs.getString(5));
				dto.setB_money(rs.getString(6));
				
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
	
	public ArrayList<SortDto> selectSort(){
		
		dbCon();
		String sql = " select c.c_class, to_char(sum(b.b_cost),'99,999')||'만원' "
				+ " from tbl_car_list c "
				+ " join tbl_buyer_list b "
				+ " on c.c_code = b.b_code "
				+ " group by c.c_class "
				+ " order by sum(b.b_cost) ";
		ArrayList<SortDto> list = new ArrayList<>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				SortDto dto = new SortDto();
				
				dto.setC_class(rs.getString(1));
				dto.setB_cost(rs.getString(2));
				
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
