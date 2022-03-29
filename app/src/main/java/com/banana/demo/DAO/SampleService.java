package com.banana.demo.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Service;

import java.util.List;

import com.banana.demo.model.UserModel;

@Service
public class SampleService {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  // データの一覧を返す
  public List<UserModel> findAll() {
    // 実行する SQL を組み立てて実行
    String query = "SELECT * from user";
    List<UserModel> users = jdbcTemplate.query(query, new BeanPropertyRowMapper<>(UserModel.class));
    return users;
  }

  // データを追加する
  public UserModel save(UserModel user) {
    // 実行する SQL を組み立てる
    SqlParameterSource param = new BeanPropertySqlParameterSource(user);
    SimpleJdbcInsert insert =
      new SimpleJdbcInsert(jdbcTemplate)
        .withTableName("user")
        .usingGeneratedKeyColumns("id");
    // SQL を実行して、AUTO_INCREMENT の値を取得する
    Number key = insert.executeAndReturnKey(param);
    user.setId(key.longValue());
    System.out.println("Add: " + user);
    return user;
  }
}