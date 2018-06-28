package AutowireByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("pancard1.xml");
		Employee employee=con.getBean("employee",Employee.class);
		if(employee!=null)
		{
			System.out.println(employee.getId()+"\t"+employee.getName());
		}
		Pancard pancard=employee.getPancard();
		if(pancard!=null)
		{
			System.out.println(pancard.getPanName()+"\t"+pancard.getPanNo());
		}

	}

}
