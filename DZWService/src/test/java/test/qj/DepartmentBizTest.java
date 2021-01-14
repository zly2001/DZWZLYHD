package test.qj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.qj.DepartmentBiz;
import com.accp.entity.Department;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= "classpath:spring-ctx.xml")
public class DepartmentBizTest {
	@Autowired
	private DepartmentBiz dbiz;
	
	@Test
	public void test() {
		for (Department temp : dbiz.queryDepartment()) {
			System.out.println(temp.getDename());
			System.out.println(temp.getDeid());
		}
	}
}
