package com.citi.service;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

import com.citi.service.UserService;

public class UserServiceTest {
 UserService userService= new UserService();
 
 @Test
 public void loginOneNull() {
  Map<String, Object> map = userService.login("", "password");
  assertEquals("账号不能为空!", map.get("usernameMsg"));
 }
 @Test
 public void loginOneSideNull() {
  Map<String, Object> map = userService.login("pasdf", "");
  assertEquals("密码不能为空!", map.get("passwordMsg"));
 }
 
}