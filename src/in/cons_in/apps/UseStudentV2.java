package in.cons_in.apps;

import in.cons_in.beans.AddressV;
import in.cons_in.beans.Addressv2;
import in.cons_in.beans.StudentV;
import in.cons_in.beans.StudentV2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.ls.LSOutput;

public class UseStudentV2
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/cons_in/resources/studentv2.xml");
        StudentV2 st=container.getBean(StudentV2.class);


        System.out.println("\nStudent Name is : "+st.getName());
        System.out.println("Student Roll NO is : "+st.getRoll());
        Addressv2 add=st.getAdd();

        System.out.println("\n=======  Student Address  ========\n");
        System.out.println("House No : "+add.getHouseNo());
        System.out.println("City : "+add.getCity());
        System.out.println("Locality : "+add.getLocality());

    }


}
