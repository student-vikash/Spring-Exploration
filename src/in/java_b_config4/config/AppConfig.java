package in.java_b_config4.config;

import in.java_b_config4.beans.Student;
import in.java_b_config4.beans.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean
    public Student student()
    {
        Student st = new Student();
        return st;
    }
    @Bean
    public Car car()
    {
        Car c = new Car();
        return c;
    }
}
