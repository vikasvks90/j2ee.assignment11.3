package assignment11.session3.Assignment11_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Car car = (Car)context.getBean("Car");
        car.drive();
    }
}
