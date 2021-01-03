package com.sl.SlShare;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sl.SlShare.demo.User;
import com.sl.SlShare.demo.UserMapper;
@RunWith(SpringRunner.class)
@SpringBootTest
class SlShareApplicationTests {

	@Autowired
    private UserMapper userMapper;
	/**
	 * mybatis-plus测试
	 */
	@Test
	void contextLoads() {
		System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
	}

}
