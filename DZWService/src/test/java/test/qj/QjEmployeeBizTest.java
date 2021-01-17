package test.qj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.qj.QjEmployeeBiz;
import com.accp.entity.Employee;
import com.accp.entity.EmployeeVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= "classpath:spring-ctx.xml")
public class QjEmployeeBizTest {
	
	@Autowired
	private QjEmployeeBiz biz;
	
	@Test
	public void test() {
		//System.out.println(biz.selectEmploee());
		for (EmployeeVO temp : biz.selectAll()) {
			System.out.println(temp.getEcreid());
			System.out.println(temp.getDename());
		}
	}
	
	@Test
	public void test1() {
		System.out.println(biz.selectByEmployeeid("1002").getEname());
		
	}
	
	@Test
	public void test2() {
		biz.selectByLogin("1001", "1001").getPosition().getFunctions().forEach(temp ->{
			System.out.println(temp);
		});		
	}
}
