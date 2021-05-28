package spring5_rest_study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring5_rest_study.service.RemoveMemberService;
@RestController
@RequestMapping("/api")
public class RestDeleteMemberController {
	@Autowired
	private RemoveMemberService service;

	
	@PostMapping("/members/{id}")
	public ResponseEntity<Object> deleteMember ( @PathVariable long id){
		System.out.println("deleteMember > " + id );
	return ResponseEntity.ok(service.removeMember(id));
			
	}
}
