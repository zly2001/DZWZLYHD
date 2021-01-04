package test.lp;

import java.io.IOException;

/*import javax.annotation.Resource;*/

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
/*import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.zly.EmployeeBiz;*/
import com.accp.dao.EmployeeMapper;


/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= "classpath:spring-ctx.xml")*/
public class EmployeeBizTest {

	/*
	 * @Resource private EmployeeBiz biz;
	 */
	
	private SqlSessionFactory ssf;
	private Logger logger = Logger.getRootLogger();

	@Before
	public void initFactory() {
		SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
		try {
			ssf = sfb.build(Resources.getResourceAsStream("MyBatisConfig.xml"));
		} catch (IOException e) {
			logger.error("配置文佳加载失败", e);
		}
	}
	
	@Test
	public void selectByLogin() {
		SqlSession session=ssf.openSession();
		EmployeeMapper dao=session.getMapper(EmployeeMapper.class);
		System.out.println(dao.selectByLogin("1001", "1001"));
	}
}
