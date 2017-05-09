package test;

import java.util.logging.LogManager;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mysql.fabric.xmlrpc.base.Data;
import com.ssm.model.User;
import com.ssm.service.IUservice;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})

public class spring {

	 private final static Logger logger = LoggerFactory.getLogger(spring.class); 
	
	@Resource
	private IUservice userService;
	
	@org.junit.Test
	public void test(){
		User u = userService.getUserById("1");
		logger.info("[用户："+u.getUserName()+"]获取成功");
	}
}
