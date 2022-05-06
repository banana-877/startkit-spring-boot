package com.banana.demo.mapper;

import com.banana.demo.model.UserModel;

import org.apache.ibatis.annotations.Mapper;
/**
 * メソッド名とマッピングファイルのIDが一致するSQLが実行される
 */
@Mapper
public interface UserMapper {
    /**
     * Emailカラムで検索するクエリ
     */
    public UserModel findByEmail(String email);

    public String prin = "いんたーふぇーす";
}