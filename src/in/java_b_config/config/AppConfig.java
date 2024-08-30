package in.java_b_config.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "in.java_b_config.beans")
public class AppConfig
{

}
