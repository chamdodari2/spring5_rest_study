package spring5_rest_study.controller;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import spring5_rest_study.dto.Member;
import spring5_rest_study.service.ModifyMemberService;

@RestController
@RequestMapping("/api")
public class RestModifyMemberController {
	static final Log log = LogFactory.getLog(RestModifyMemberController.class);

	@Autowired
	private ModifyMemberService service;

	@PutMapping("/members/{id}")
	public ResponseEntity<Object> updateMember(@PathVariable long id, @RequestBody Member member) {
		System.out.println("updateMember > " + member);
		return ResponseEntity.ok(service.modifyMember(member));
	}
	
	@GetMapping("/update")
	public ModelAndView updateMember(@RequestParam(value = "id") long id) {
	ModelAndView mav = new ModelAndView("member/update", "id", id);
	return mav;
	}

}
