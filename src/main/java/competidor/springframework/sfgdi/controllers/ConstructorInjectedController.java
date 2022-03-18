package competidor.springframework.sfgdi.controllers;

import competidor.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

  //@Autowired
  // para el caso del constructor no hace falta hacer el autowired
  // ya que desde la versión 4.x es opcional
  private final GreetingService greetingService;

  public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting(){
    return greetingService.sayGreeting();
  }
}
