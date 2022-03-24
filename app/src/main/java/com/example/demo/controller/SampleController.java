package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import com.example.demo.DAO.SampleService;
import com.example.demo.model.UserModel;

@SpringBootApplication
// @RestController
@Controller
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
    service.findAll();
    return "起動確認";
  }

  @RequestMapping("/hello")
  private String init(Model model) {
      Authentication auth = SecurityContextHolder.getContext().getAuthentication();
      //Principalからログインユーザの情報を取得
      String userName = auth.getName();
      model.addAttribute("userName", userName);
      return "hello";
  }
}