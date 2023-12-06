package br.com.mvc.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
  @GetMapping("hello")
  public String hello() {
    return "hello"; // o sprint vai renderizar o arquivo hello.html que está dentro de
                    // resources/templates
  }
}
