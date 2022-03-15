package competidor.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

  public String sayHello(){
    System.out.println("Hi Folks!!!");
    return "I say hello everybody!!!";
  }
}
