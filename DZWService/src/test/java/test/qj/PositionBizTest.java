package test.qj;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.qj.PositionBiz;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= "classpath:spring-ctx.xml")
public class PositionBizTest {
	@Resource
	private PositionBiz biz;
	
	@Test
	public void test() {
		System.out.println(biz.selectAll());
	}
}
