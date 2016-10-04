package transaction_spring;

import java.util.ArrayList;
import java.util.List;


public class FooInterImpl implements FooInter{
	@Override
	public List<FooDto> getFoo() {
		List<FooDto> list = new ArrayList<FooDto>();
		System.out.println("전체 자료 셀렉트 수행함");
		return list;
	}
	
	@Override
	public FooDto getFoo(String name) {
		FooDto dto = new FooDto();
		System.out.println("일부 자료 셀렉트 처리함");
		return dto;
	}
	
	@Override
	public void insertFoo(FooDto fooDto) {
//		try {
//			System.out.println("인서트 처리함");
//		} catch (Exception e) {
//			throw new WowException("추가 에러 발생");
//		}
		throw new WowException("추가 에러 발생");
	}
	
	@Override
	public void updateFoo(FooDto fooDto) {
//		try {
//			System.out.println("업데이트 처리함");
//		} catch (Exception e) {
//			throw new WowException("업데이트 에러 발생");
//		}
		throw new WowException("업데이트 에러 발생");
	}
}
