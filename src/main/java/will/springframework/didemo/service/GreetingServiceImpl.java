package will.springframework.didemo.service;

public class GreetingServiceImpl implements GreetingService {
    public static final String HELLO_GREETING = "Hello!!!";

    public String sayGreeting() {
        return GreetingServiceImpl.HELLO_GREETING;
    }
}
