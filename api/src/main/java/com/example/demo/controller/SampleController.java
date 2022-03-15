package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.example.demo.DAO.SampleService;
import com.example.demo.model.UserModel;

@SpringBootApplication
@RestController
public class SampleController {

  @Autowired
  private SampleService service;

  // 指定した name のデータを追加する
  @RequestMapping("/add/{name}")
  public List<UserModel> index(@ModelAttribute UserModel user) {
    service.save(user);
    return service.findAll();
  }

  // 指定した name のデータを追加する
  @RequestMapping("/start")
  public String aaaString() {
    return "起動確認";
  }
}