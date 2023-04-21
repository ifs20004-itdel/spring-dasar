package SoftwareDev.springdasar;

import SoftwareDev.springdasar.Data.Bar;
import SoftwareDev.springdasar.Data.Foo;
import SoftwareDev.springdasar.Scope.DoubletonScope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
@Slf4j
@Configuration
public class ScopeConfiguration {
    @Bean
    @Scope("prototype")
    public Foo foo()
    {
        log.info("Create new foo");
        return new Foo();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer(){
        CustomScopeConfigurer customScopeConfigurer = new CustomScopeConfigurer();
        customScopeConfigurer.addScope( "doubleton", new DoubletonScope());
        return customScopeConfigurer;
    }

    @Bean
    @Scope("doubleton")
    public Bar bar(){
        log.info("Create new bar");
        return new Bar();
    }
}
