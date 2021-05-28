package spring5_rest_study.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import spring5_rest_study.dto.Member;

@Component
public interface MemberMapper {
	

	Member selectMemberById(Long memId);
	List<Member> selectAll();	//멤버 전체 검색 (번호,멤버이름)?

	int insert(Member member);
	int update(Member member);
	int delete(Member member);
	
//	public List<Member> selectMemberByRegdate(ListCommand listCommand);
	
	

}
