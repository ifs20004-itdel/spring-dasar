package SoftwareDev.springdasar;

import SoftwareDev.springdasar.Data.Bar;
import SoftwareDev.springdasar.Data.Foo;
import SoftwareDev.springdasar.Data.FooBar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration
public class OptionalConfiguration {

    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar){
        return new FooBar( foo.orElse(null), bar.orElse(null));
    }

}
