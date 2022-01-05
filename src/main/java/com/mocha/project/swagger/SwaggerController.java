package com.mocha.project.swagger;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/v1")
public class SwaggerController {
	
	@GetMapping("user/search")
  public Map<String, String> search() {
      Map<String, String> response = new HashMap<String, String>();
      response.put("name", "minjee.kim");
      response.put("age", "28");
      response.put("email", "xxxxxxxx@gmail.com");
      return response;
  }

}