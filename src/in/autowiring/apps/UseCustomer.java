package in.autowiring.apps;

import in.autowiring.beans.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseCustomer
{
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("in/autowiring/resources/customer.xml");

        Customer customer = container.getBean(Customer.class);
        customer.showInformation();  // NullPointerException in case of autowire="no";   no , byName , byType

    }
}
