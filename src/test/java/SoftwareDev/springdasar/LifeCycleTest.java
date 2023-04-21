package SoftwareDev.springdasar;

import SoftwareDev.springdasar.Data.Connection;
import SoftwareDev.springdasar.Data.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {

    private ConfigurableApplicationContext applicationContext;

//    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @AfterEach
    void tearDown(){
//        applicationContext.close();
    }

    @Test
    void testConnection(){
        Connection connect = applicationContext.getBean(Connection.class);
    }

    @Test
    void testServer(){
        applicationContext.getBean(Server.class);
    }
}
