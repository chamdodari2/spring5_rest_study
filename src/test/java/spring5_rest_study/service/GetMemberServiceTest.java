package spring5_rest_study.service;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.After;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.junit.Assert;

import spring5_rest_study.config.ContextRoot;
import spring5_rest_study.dto.Member;
import spring5_rest_study.mapper.MemberMapper;
import spring5_rest_study.mapper.MemberMapperTest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ContextRoot.class })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@WebAppConfiguration
public class GetMemberServiceTest {

	protected static final Log log = LogFactory.getLog(MemberMapperTest.class);

	@Autowired
	private GetMemberService service;

	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void testGetMember() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Member member = service.getMember(37);
		Assert.assertNotNull(member);

		log.debug(member.toString());
	}

}
