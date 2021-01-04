package test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.zly.EmployeeBiz;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= "classpath:spring-ctx.xml")
public class EmployeeBizTest {

	@Resource
	private EmployeeBiz biz;
	
	@Test
	public void selectByLogin() {
		System.out.println(biz.selectByLogin("1001", "1001"));
	}
}
