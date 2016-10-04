package pack;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class GogekImpl extends JdbcDaoSupport implements GogekInter{
	
	@Override
	public List<SawonDto> selectList(String buser) throws DataAccessException {
		RowMapper rowMapper = new SangRowMapper();
		
		return getJdbcTemplate().query("select * from sawon left join buser on buser_num=buser_no where buser_no="+ buser, rowMapper);
	}
	
	@Override
	public List<SawonDto> config(String no, String name) throws DataAccessException {
		RowMapper rowMapper = new SangRowMapper();
		
		return getJdbcTemplate().query("select * from sawon left join buser on buser_num=buser_no where sawon_no=" + no + " and sawon_name='" + name + "'", rowMapper);
	}
	
	
	class SangRowMapper implements RowMapper{
		@Override
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			SawonDto dto = new SawonDto();
			dto.setSawon_no(rs.getString("sawon_no"));
			dto.setSawon_name(rs.getString("sawon_name"));
			dto.setBuser_name(rs.getString("buser_name"));
			dto.setSawon_jik(rs.getString("sawon_jik"));
			return dto;
		}
	}
}
