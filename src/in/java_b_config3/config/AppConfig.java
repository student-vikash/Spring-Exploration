package in.java_b_config3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"in.java_b_config3.bean1", "in.java_b_config3.bean2","in.java_b_config3.bean3"})
public class AppConfig
{

}
