package pack;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

public class SawonImpl extends JdbcDaoSupport implements SawonInter{
	@Override
	public List<SawonDto> selectList() throws DataAccessException {
		RowMapper rowMapper = new GogekRowMapper();
		
		return getJdbcTemplate().query("select sawon_no, sawon_name, buser_name, sawon_jik, buser_num from sawon inner join buser on buser_no=buser_num", rowMapper);
	}
	
	class GogekRowMapper implements RowMapper{
	
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException{
			// select 실행결과를 한 레코드씩 전달받아 처리하는 메소드.(re.next 필요없다)
			System.out.println("s" + rowNum + "s");
			SawonDto dto = new SawonDto();
			dto.setSawon_no(rs.getString("sawon_no"));
			dto.setSawon_name(rs.getString("sawon_name"));
			dto.setBuser_name(rs.getString("buser_name"));
			dto.setSawon_jik(rs.getString("sawon_jik"));
			dto.setBuser_num(rs.getString("buser_num"));
			
			return dto;
		}
	}

}
