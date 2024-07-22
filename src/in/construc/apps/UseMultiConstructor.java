package in.construc.apps;

import in.construc.beans.MultiConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseMultiConstructor
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/construc/resources/multiconstructor.xml");
        MultiConstructor m=container.getBean(MultiConstructor.class);

        m.show();


    }
}
