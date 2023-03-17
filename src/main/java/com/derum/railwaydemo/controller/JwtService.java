package com.derum.railwaydemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

  @Value("${spring.jwt.secret-key}")
  private String secretKey;

  public String getSecretKet(){
    return secretKey;
  }

}
