package DImap;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	       public static void main(String[] args) {
	              ApplicationContext ctx=new ClassPathXmlApplicationContext("di.xml");
	              System.out.println("=================== Using Map=============");
	              DependencyInjection di=(DependencyInjection)ctx.getBean("con");
	              di.show();}
}
