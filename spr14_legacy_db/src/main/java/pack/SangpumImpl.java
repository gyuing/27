package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class SangpumImpl implements SangpumInter{
	
	
	public SangpumImpl() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("생성자 오류 " + e);
		}
	}
	
	
	@Override
	public void selectList() {
		try {
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123");
			PreparedStatement pstmt = conn.prepareStatement("select * from sangdata");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString(1) + " " +
						rs.getString(2) + " " +
						rs.getString(3) + " " +
						rs.getString(4));
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("셀렉트리스트 오류 " + e);
		}
	}
}
