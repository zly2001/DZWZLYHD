package test.qj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.qj.AuthorityBiz;
import com.accp.entity.Authority;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= "classpath:spring-ctx.xml")
public class AuthorityBizTest {
	
	@Autowired
	private AuthorityBiz biz;
	
	@Test
	public void test() {
		biz.insert(new Authority(0,3,1));
	}
	
	@Test
	public void test1() {
		biz.deleteAuthority(3);
	}
}
