package com.banana.demo.dao;

import com.banana.demo.mapper.UserMapper;
import com.banana.demo.model.UserModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * DBへのアクセスメソッドを呼び出すDao
 * @author maeda@banana
 *
 */
@Service
public class LoginUserDao{
	
	@Autowired
    UserMapper userMapper;
	
	/**
	 * フォームの入力値から該当するユーザを検索 合致するものが無い場合Nullが返される
	 * @param email
	 * @return 一致するユーザが存在するとき:UserEntity、存在しないとき:Null
	 */
	public UserModel findUser(String email) {

		UserModel user = userMapper.findByEmail(email);
		
		System.out.println(user);

        return user;
	}
}