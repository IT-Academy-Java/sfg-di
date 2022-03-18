package competidor.springframework.sfgdi;

import competidor.springframework.sfgdi.controllers.ConstructorInjectedController;
import competidor.springframework.sfgdi.controllers.MyController;
import competidor.springframework.sfgdi.controllers.PropertyInjectedController;
import competidor.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("---------- Primary Bean ----------");
		System.out.println(myController.sayHello() + "\n");

		System.out.println("---------- Property ----------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting() + "\n");

		System.out.println("---------- Setter ----------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("\n---------- Controller ----------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
