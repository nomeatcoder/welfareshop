package cn.nomeatcoder.application;

import cn.nomeatcoder.common.query.UserQuery;
import cn.nomeatcoder.dal.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@TestPropertySource(
	locations = {"classpath:application-test.properties"}
)
@MapperScan(basePackages = {
	"cn.nomeatcoder.dal.mapper"
})
@Slf4j
public class AppTest {

	@Resource
	private UserMapper userMapper;

	@Test
	public void test() {
		System.out.println("success");
		log.info("-------------success--------------");
	}

	@Test
	public void testMapper(){
		System.out.println(userMapper);
		UserQuery query = new UserQuery();
		query.setPageSize(2L);
		System.out.println(userMapper.find(query));
	}
	@SpringBootApplication
	public static class Config{

	}
}
