package in.java_b_config6.config;

import in.java_b_config6.beans.Student3;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig3
{
    @Bean(name = "MyStudent")
    @Scope(value = "singleton")
//    @Scope(value = "prototype")
//    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
//    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)

    public Student3 student()
    {
        Student3 st = new Student3();
        return st;
    }
}
