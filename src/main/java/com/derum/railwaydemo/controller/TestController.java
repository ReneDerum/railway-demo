package com.derum.railwaydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

  private JwtService jwtService;

  public TestController(JwtService jwtService) {
    this.jwtService = jwtService;
  }

  @GetMapping
  public String getSecretKey(){
    return "Secret Key: " + jwtService.getSecretKet();
  }

}
