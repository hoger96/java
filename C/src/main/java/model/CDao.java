package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CDao {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "system";
	String password = "1234";
	
	Connection con = null;
	
	private void dbCon() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(con != null) {
			System.out.println("연결성공");
		}
	}
	
	public void insert(RegDto dto) {
		dbCon();
		String sql = "insert into tbl_salelist_01 values(?,?,?,?,?)";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, dto.getSaleno());
			pst.setString(2, dto.getPcode());
			pst.setString(3, dto.getSaledate());
			pst.setString(4, dto.getScode());
			pst.setString(5, dto.getAmount());
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public SeqDto selectSeq() {
		dbCon();
		String sql = " select saleno.nextval "
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
	
	public ArrayList<SaleDto> selectSalelist(){
		dbCon();
		String sql = " select s.saleno, s.pcode, "
				+ " to_char(s.saledate,'yyyy-mm-dd'), s.scode, p.name, s.amount, "
				+ " to_char((s.amount*p.cost),'999,999') "
				+ " from tbl_salelist_01 s "
				+ " join tbl_product_01 p "
				+ " on s.pcode = p.pcode ";
		ArrayList<SaleDto> list = new ArrayList<>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				SaleDto dto = new SaleDto();
				
				dto.setSaleno(rs.getString(1));
				dto.setPcode(rs.getString(2));
				dto.setSaledate(rs.getString(3));
				dto.setScode(rs.getString(4));
				dto.setName(rs.getString(5));
				dto.setAmount(rs.getString(6));
				dto.setCost(rs.getString(7));
				
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
	
	public ArrayList<StoreDto> selectStore(){
		dbCon();
		String sql = " select sh.scode, sh.sname, to_char(sum((s.amount*p.cost)),'999,999') "
				+ " from tbl_salelist_01 s "
				+ " join tbl_shop_01 sh "
				+ " on s.scode = sh.scode "
				+ " join tbl_product_01 p "
				+ " on s.pcode = p.pcode "
				+ " group by sh.scode, sh.sname "
				+ " order by sh.scode ";
		ArrayList<StoreDto> list = new ArrayList<>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				StoreDto dto = new StoreDto();
				
				dto.setScode(rs.getString(1));
				dto.setSname(rs.getString(2));
				dto.setCost(rs.getString(3));
				
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
	
	public ArrayList<ProductDto> selectProduct(){
		dbCon();
		String sql = " select p.pcode, p.name, to_char(sum((s.amount*p.cost)),'999,999') "
				+ " from tbl_salelist_01 s "
				+ " join tbl_product_01 p "
				+ " on s.pcode = p.pcode "
				+ " group by  p.pcode, p.name ";
		ArrayList<ProductDto> list = new ArrayList<>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				ProductDto dto = new ProductDto();
				
				dto.setPcode(rs.getString(1));
				dto.setPname(rs.getString(2));
				dto.setCost(rs.getString(3));
				
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
	
	public RegDto selectSaleno(String saleno) {
		dbCon();
		String sql = " select saleno, pcode, to_char(saledate,'yyyymmdd'), scode, amount "
					+ " from tbl_salelist_01 "
					+ " where saleno=? ";
		RegDto dto = new RegDto();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, saleno);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				dto.setSaleno(rs.getString(1));
				dto.setPcode(rs.getString(2));
				dto.setSaledate(rs.getString(3));
				dto.setScode(rs.getString(4));
				dto.setAmount(rs.getString(5));
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
		String sql = " update tbl_salelist_01 " 	
				 	+ " set pcode=?, saledate=?, scode=?, amount=? "
				 	+ " where saleno=? ";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, dto.getPcode());
			pst.setString(2, dto.getSaledate());
			pst.setString(3, dto.getScode());
			pst.setString(4, dto.getAmount());
			pst.setString(5, dto.getSaleno());
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void delete(String saleno) {
		dbCon();
		String sql = " delete tbl_salelist_01 "
					+ " where saleno=? ";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, saleno);
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public SaleDto selectOne(String saleno) {
		dbCon();
		String sql = " select s.saleno, s.pcode, "
				+ " to_char(s.saledate,'yyyy-mm-dd'), s.scode, p.name, s.amount, "
				+ " to_char((s.amount*p.cost),'999,999') "
				+ " from tbl_salelist_01 s "
				+ " join tbl_product_01 p "
				+ " on s.pcode = p.pcode "
				+ " where saleno=? ";
		SaleDto dto = new SaleDto();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, saleno);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				dto.setSaleno(rs.getString(1));
				dto.setPcode(rs.getString(2));
				dto.setSaledate(rs.getString(3));
				dto.setScode(rs.getString(4));
				dto.setName(rs.getString(5));
				dto.setAmount(rs.getString(6));
				dto.setCost(rs.getString(7));
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
