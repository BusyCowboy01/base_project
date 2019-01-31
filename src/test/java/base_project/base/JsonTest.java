package base_project.base;

import com.wsw.BaseProjectApplication;
import com.wsw.essearch.domain.User;
import com.wsw.essearch.utils.JsonUtils;
import com.wsw.redis.util.RedisClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)  //底层用junit  SpringJUnit4ClassRunner
@SpringBootTest(classes={ BaseProjectApplication.class})//启动整个springboot工程
public class JsonTest {
	
	
	@Autowired
	private StringRedisTemplate strTpl;
	
	@Autowired
	private RedisClient redis;
	
	@Test
	public void testOne(){
		User u = new User();
		u.setAge(1);
		u.setPhone("111");
		u.setPwd("0000");
		String str = JsonUtils.obj2String(u);
		strTpl.opsForValue().set("str", str);
		System.out.println(str);
		
	}

}
