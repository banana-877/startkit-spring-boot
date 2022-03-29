package com.banana.demo.dao;

import java.util.Map;

import com.banana.demo.model.LoginUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


/**
 * DBへのアクセスメソッドを呼び出すDao
 * @author maeda@banana
 *
 */
@Repository
public class LoginUserDao {
	
	@Autowired
  	private JdbcTemplate jdbcTemplate;
	
	/**
	 * フォームの入力値から該当するユーザを検索 合致するものが無い場合Nullが返される
	 * @param userName
	 * @return 一致するユーザが存在するとき:UserEntity、存在しないとき:Null
	 */
	public LoginUser findUser(String userName) {
		String sql = ""
		 + "SELECT * "
		 + "FROM user "
		 + "WHERE user_name = ? "; 

        Map<String, Object> data = jdbcTemplate.queryForMap(sql, userName);
 
        LoginUser user = new LoginUser(
                (Integer) data.get("user_id")
                ,(String) data.get("user_name")
                ,(String) data.get("password")
         );
 
        return user;
	}

}