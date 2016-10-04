package pack.aop3;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository	//컴퍼넌트라 쓰지안코 리퐈쥐토뤼라고 쑨돠
public class ArticleDao implements ArticleInter{
	@Override
	public void selectAll() {
		System.out.println("sawon자료 전체 읽기 수행");
	}
	
	
}
