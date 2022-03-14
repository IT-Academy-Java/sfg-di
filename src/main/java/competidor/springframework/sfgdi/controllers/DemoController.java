package competidor.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

  @GetMapping("sayHello")
  public String sayHello(){
    System.out.println("hello world!");
    return "Hi Folks!";
  }
}
