package com.banana.demo.dao;

import java.util.Map;

import com.banana.demo.model.LoginUserModel;

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
	 * @param email
	 * @return 一致するユーザが存在するとき:UserEntity、存在しないとき:Null
	 */
	public LoginUserModel findUser(String email) {
		String sql = ""
		 + "SELECT * "
		 + "FROM user "
		 + "WHERE email = ? "; 

        Map<String, Object> data = jdbcTemplate.queryForMap(sql, email);
 
        LoginUserModel loginuser = new LoginUserModel(
                (Integer) data.get("user_id")
                ,(String) data.get("user_name")
				,(String) data.get("email")
                ,(String) data.get("password")
         );
 
        return loginuser;
	}

}