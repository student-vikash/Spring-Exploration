package in.annotation_viru.app;


import in.annotation_viru.beans.Car3;
import in.annotation_viru.beans.Student3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStu3Car3
{
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("in/annotation_viru/resources/stu3car3config.xml");
        Student3 st = (Student3) container.getBean("student3");
        Car3 cr = (Car3) container.getBean("car3");


        st.studentInfo();
        cr.carInfo();

    }
}
