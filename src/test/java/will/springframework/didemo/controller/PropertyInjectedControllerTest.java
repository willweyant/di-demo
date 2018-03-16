package will.springframework.didemo.controller;

import org.junit.Before;
import org.junit.Test;
import will.springframework.didemo.service.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController controller;

    @Before
    public void setUp() {
        this.controller = new PropertyInjectedController();
        this.controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testSayGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GREETING, controller.sayHello());
    }
}
