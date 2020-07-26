package com.xp.service;

import com.xp.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class UserService {
	@Autowired
	private UserMapper userMapper;

	@Transactional
	// @Datasource(ref="datasource2")
	public int insertUser(String name, Integer age) {
		int insertUserResult = userMapper.insert(name, age);
		int i = 1 / age;
		log.info("######insertUserResult:{}##########", insertUserResult);
		// 怎么样验证事务开启成功!~
		return insertUserResult;
	}

}
