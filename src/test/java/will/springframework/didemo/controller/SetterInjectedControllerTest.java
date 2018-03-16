package will.springframework.didemo.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import will.springframework.didemo.service.GreetingServiceImpl;

public class SetterInjectedControllerTest {
    private SetterInjectedController controller;

    @Before
    public void setUp() {
        this.controller = new SetterInjectedController();
        this.controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testSayGreeting() {
        Assert.assertEquals(GreetingServiceImpl.HELLO_GREETING, controller.sayHello());
    }
}
