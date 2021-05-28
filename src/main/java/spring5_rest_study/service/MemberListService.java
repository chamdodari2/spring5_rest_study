package spring5_rest_study.service;

import java.util.List;

import org.springframework.stereotype.Service;

import spring5_rest_study.dto.Member;

@Service
public interface MemberListService {
	List<Member> getLists();	//멤버 전체 검색 (번호,멤버이름)?

	

}
