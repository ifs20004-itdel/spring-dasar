package SoftwareDev.springdasar;

import SoftwareDev.springdasar.Data.Foo;
import SoftwareDev.springdasar.Data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OptionalTest {

    private ConfigurableApplicationContext applicationContex;

    @BeforeEach
    void setUp(){
        applicationContex = new AnnotationConfigApplicationContext(OptionalConfiguration.class);
        applicationContex.registerShutdownHook();
    }

    @Test
    void testOptional(){
        Foo foo = applicationContex.getBean(Foo.class);
        FooBar fooBar = applicationContex.getBean(FooBar.class);

        Assertions.assertNull(fooBar.getBar());
        Assertions.assertSame(foo,fooBar.getFoo());
    }
}
