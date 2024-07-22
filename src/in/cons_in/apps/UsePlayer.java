package in.cons_in.apps;

import in.cons_in.beans.Player;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsePlayer
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/cons_in/resources/player.xml");
        Player p=(Player) container.getBean("pObj");

        p.showInfo();
    }
}
