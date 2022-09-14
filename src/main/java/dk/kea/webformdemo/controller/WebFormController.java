package dk.kea.webformdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class WebFormController {

  @GetMapping("/")
  public String showForm() {
    return "webform";
  }

  @PostMapping("/creategreeting")
  public String showGreeting(@RequestParam("name") String name, @RequestParam("age") int age, RedirectAttributes redirectAttributes) {
    System.out.println(name + age); // Replace wih database create/update/delete

    redirectAttributes.addAttribute("name", name);
    redirectAttributes.addAttribute("age", age);

    return "redirect:/creategreeting";
  }

  @GetMapping("/creategreeting")
  public String createGreetingSite(@RequestParam("name") String name, @RequestParam("age") int age, Model model) {

    model.addAttribute("name", name);
    model.addAttribute("age", age);

    return "greetingsite";
  }

}
