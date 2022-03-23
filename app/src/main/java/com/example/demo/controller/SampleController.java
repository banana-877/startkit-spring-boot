package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
    service.findAll();
    return "起動確認";
  }

  @GetMapping("/signup")
    public String getSignUp(Model model) {
        // signup.htmlに画面遷移
        return "login/signup";
    }

    @PostMapping("/signup")
    public String postSignUp(Model model) {

        // login.htmlにリダイレクト
        return "redirect:/login";
    }

}