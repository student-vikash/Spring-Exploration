package in.scope.apps;

import in.scope.beans.Address;
import in.scope.beans.StudentInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudentInfo
{
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("in/scope/resources/studentinfo.xml");
        System.out.println("Container Started Viru ....");

        System.out.println("\nBoth StudentInfo(singleton) and Address(prototype)  will be instantiated smoothly...\n");

        StudentInfo st = container.getBean(StudentInfo.class);
        Address a=container.getBean(Address.class);

        System.out.println("Name is : "+st.getName());
        System.out.println("Roll no : "+st.getRollNo());
        System.out.println("\n === Address === \n");
        System.out.println("House No : "+a.getHouseNo());
        System.out.println("City : "+a.getCity());


    }
}
