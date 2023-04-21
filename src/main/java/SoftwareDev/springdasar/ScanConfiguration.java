package SoftwareDev.springdasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "SoftwareDev.springdasar.Configuration"
})
public class ScanConfiguration {

}
