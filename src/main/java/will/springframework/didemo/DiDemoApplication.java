package will.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import will.springframework.didemo.controller.MyController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
        final ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        final MyController controller = (MyController) ctx.getBean("myController");

        controller.hello();
	}
}
