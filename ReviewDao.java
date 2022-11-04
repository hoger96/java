package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReviewDao {

	
	//연결정보
	String driver = "oracle.jdbc.driver.OracleDriver" ;
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
	String password="1234";

	
	Connection con= null;
	
	private void dbCon() {	
		try {
			Class.forName(driver);
			con  = DriverManager.getConnection(url, user, password);
			
			if( con != null) {
				System.out.println(" 연결성공");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
	
	///
	
	public ArrayList<Review> selectReviews(){
		
		ArrayList<Review> list = new ArrayList<>();
		
		dbCon();
		
		String sql =" select  title, review  from review  " ;
		try {
			PreparedStatement pst  = con.prepareStatement(sql);
			ResultSet   rs  = pst.executeQuery();
			
			while( rs.next()) {
				
				String title = rs.getString(1);
				String review = rs.getString(2);
				
				Review r = new  Review();
				r.setTitle(title);
				r.setReview(review);
				
				list.add(r);
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
		ReviewDao   dao = new ReviewDao();
		//dao.dbCon();
		
		
		ArrayList<Review> list  = dao.selectReviews();
		
		for(  Review review: list) {
			
			System.out.println(  review);
		}
		
		
		/*
		for( int i=0  ;  i < list.size() ; i++) {			
			Review  review = list.get(i);
			System.out.println(  review );			
		}
		*/
		
		
	}
	
	
}
