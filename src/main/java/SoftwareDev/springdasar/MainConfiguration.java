package SoftwareDev.springdasar;

import SoftwareDev.springdasar.Configuration.BarConfiguration;
import SoftwareDev.springdasar.Configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@Configuration
@Import(
        {
                FooConfiguration.class,
                BarConfiguration.class
        }
)
public class MainConfiguration
{
}
