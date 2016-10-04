package pack;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface GogekInter {
	List<SawonDto> selectList(String buser) throws DataAccessException;
	List<SawonDto> config(String no, String name) throws DataAccessException;
}
