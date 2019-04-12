package com.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.bean.User;

@Mapper
public interface UserMapper {
	/*@Select("SELECT * FROM user_info where id = #{id}")*/
	 User findUserById(String id);
}
