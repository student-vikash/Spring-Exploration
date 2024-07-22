package in.cons_in.apps;

import in.cons_in.beans.AddressV;
import in.cons_in.beans.StudentV;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudentV
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/cons_in/resources/studentv.xml");
        StudentV st=container.getBean(StudentV.class);

        System.out.println("\nStudent Name is : "+st.getName());
        System.out.println("Student Roll NO is : "+st.getRoll());
        AddressV add=st.getAddr();

        System.out.println("\n=======  Student Address  ========\n");
        System.out.println("House No : "+add.getHouseNo());
        System.out.println("City : "+add.getCity());
        System.out.println("Locality : "+add.getLacality());

    }
}
