package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GsDao {

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
	
	public ArrayList<GoodsDto> selectGoods(){
		dbCon();
		String sql = " select goods_cd, goods_nm, goods_price, cost, to_char(in_date,'yyyy-mm-dd') "
				+ " from goods ";
		ArrayList<GoodsDto> list = new ArrayList<>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				GoodsDto dto = new GoodsDto();
				
				dto.setGoods_cd(rs.getString(1));
				dto.setGoods_nm(rs.getString(2));
				dto.setPrice(rs.getString(3));
				dto.setCose(rs.getString(4));
				dto.setIn_date(rs.getString(5));
				
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
	
	public void insert(GoodsDto dto) {
		dbCon();
		String sql = " insert into goods values(?,?,?,?,?) ";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, dto.getGoods_cd());
			pst.setString(2, dto.getGoods_nm());
			pst.setString(3, dto.getPrice());
			pst.setString(4, dto.getCose());
			pst.setString(5, dto.getIn_date());
			
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
		String sql = " select goods_cd.nextval "
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
	
	public GoodsDto selectGoodscd(String goods_cd) {
		dbCon();
		String sql = " select goods_cd, goods_nm, goods_price, cost, to_char(in_date,'yyyy-mm-dd') "
					+ " from goods "
					+ " where goods_cd=? ";
		GoodsDto dto = new GoodsDto();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, goods_cd);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				dto.setGoods_cd(rs.getString(1));
				dto.setGoods_nm(rs.getString(2));
				dto.setPrice(rs.getString(3));
				dto.setCose(rs.getString(4));
				dto.setIn_date(rs.getString(5));
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
	
	public void update(GoodsDto dto) {
		dbCon();
		String sql = " update goods "
					+ " set goods_nm=?, goods_price=?, cost=? "
					+ " where goods_cd=? ";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, dto.getGoods_nm());
			pst.setString(2, dto.getPrice());
			pst.setString(3, dto.getCose());
			pst.setString(4, dto.getGoods_cd());
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<StoreDto> selectStore(){
		dbCon();
		String sql = " select st.store_nm, "
				+ " to_char(nvl(sum(decode(s.pay_type,'01',s.sale_cnt*g.goods_price)),0),'99,999')||'원' as cash, "
				+ " to_char(nvl(sum(decode(s.pay_type,'02',s.sale_cnt*g.goods_price)),0),'99,999')||'원' as card, "
				+ " to_char(sum(s.sale_cnt*g.goods_price),'99,999')||'원' as total "
				+ " from sale s "
				+ " join goods g "
				+ " on g.goods_cd = s.goods_cd "
				+ " join store st "
				+ " on st.store_cd = s.store_cd "
				+ " group by st.store_nm ";
		ArrayList<StoreDto> list = new ArrayList<>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				StoreDto dto = new StoreDto();
				
				dto.setStore_nm(rs.getString(1));
				dto.setCash(rs.getString(2));
				dto.setCard(rs.getString(3));
				dto.setTotal(rs.getString(4));
				
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
	
	public ArrayList<SaleDto> selectSale(String store_nm){
		dbCon();
		String sql = " select decode(s.sale_fg, '1','판매','2','취소') as fg, "
				+ " s.sale_no, to_char(g.in_date,'yyyy-mm-dd'),g.goods_nm, s.sale_cnt, g.goods_price, decode(s.pay_type,'01','현금','02','카드') "
				+ " from sale s "
				+ " join goods g "
				+ " on g.goods_cd = s.goods_cd "
				+ " join store st "
				+ " on st.store_cd = s.store_cd "
				+ " where st.store_nm=? ";
		ArrayList<SaleDto> list = new ArrayList<>();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, store_nm);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				SaleDto dto = new SaleDto();
				
				dto.setSale_fg(rs.getString(1));
				dto.setSale_no(rs.getString(2));
				dto.setIn_date(rs.getString(3));
				dto.setGoods_nm(rs.getString(4));
				dto.setSale_cnt(rs.getString(5));
				dto.setPrice(rs.getString(6));
				dto.setPay_type(rs.getString(7));
				
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
		GsDao dao = new GsDao();
		String store_nm = "하계점";
		ArrayList<SaleDto> list = dao.selectSale(store_nm);
		System.out.println(list);
	}
}
