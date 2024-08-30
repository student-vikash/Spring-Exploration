package in.java_b_config5.config;

import in.java_b_config5.beans.Car;
import in.java_b_config5.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean(name = "MyStudent")
    public Student student()
    {
        Student st = new Student();
        return st;
    }
    @Bean(name = "MyCar")
    public Car car()
    {
        Car c = new Car();
        return c;
    }
}
