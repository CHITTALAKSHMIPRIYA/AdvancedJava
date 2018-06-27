package constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("test.xml");
		Employee e=context.getBean("emp",Employee.class);
		Employee e1=context.getBean("emp1",Employee.class);
		e.show();
		e1.show();

	}

}
