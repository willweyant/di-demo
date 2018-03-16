package will.springframework.didemo.controller;

import will.springframework.didemo.service.GreetingService;


public class PropertyInjectedController {
    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
