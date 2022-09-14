package dk.kea.webformdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebFormController {

  @GetMapping("/")
  public String showForm() {
    return "webform";
  }

}
