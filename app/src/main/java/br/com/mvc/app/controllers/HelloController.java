package br.com.mvc.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

  @GetMapping("hello-model-view")
  public ModelAndView hello() {
    ModelAndView mv = new ModelAndView("hello");
    mv.addObject("nome", "Gregório");
    return mv;
  }

  @GetMapping("hello-servlet")
  public String hello(HttpServletRequest request) {
    request.setAttribute("nome", "João");
    return "hello"; // o sprint vai renderizar o arquivo hello.html que está dentro de
                    // resources/templates
  }

  @GetMapping("hello-model")
  public String hello(Model model) {
    model.addAttribute("nome", "Israel");
    return "hello"; // o sprint vai renderizar o arquivo hello.html que está dentro de
                    // resources/templates
  }
}
