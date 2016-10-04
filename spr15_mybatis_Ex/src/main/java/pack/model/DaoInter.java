package pack.model;

import java.util.List;

public interface DaoInter {
	List<SawonDto> selectDataAll();
	List<CountDto> countData();
}
