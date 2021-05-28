package spring5_rest_study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring5_rest_study.service.MemberListService;

@RestController
@RequestMapping("/api")
public class RestMemberListController {


	@Autowired
	private MemberListService memberListService;

//	
//	@GetMapping("/members")
//	public List<Member> members() {
//		System.out.println("members()");
//		return memberListService.getLists();
//	}
//	
	
	@GetMapping("/members")
	public ResponseEntity<Object> members() {
		System.out.println("members()");
		return ResponseEntity.ok(memberListService.getLists());

	}
	
}

