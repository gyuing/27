package pack.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import pack.resource.SqlMapConfig;

public class SawonDao implements DaoInter{
	
	private SqlSessionFactory factory = SqlMapConfig.getSqlSession();
	private SqlSession session = factory.openSession();
	
	@Override
	public List<SawonDto> selectDataAll() {
		
		List<SawonDto> list = null;
		
		try {
			list = session.selectList("selectDataAll");
		} catch (Exception e) {
			System.out.println("selectDataAll err : " + e);
		}
		
		return list;
	}
	
	@Override
	public List<CountDto> countData() {
		
		List<CountDto> list2 = null;
		
		try {
			list2 = session.selectList("countData");
		} catch (Exception e) {
			System.out.println("카운트 에러 : " + e);
		}
		return list2;
	}
}
