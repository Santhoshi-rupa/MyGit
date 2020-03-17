 
	package Main;

	import java.util.Iterator;
	import java.util.List;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	import DAO.IStudentDAO;
	import DAO.StudentDaoImpl;
	import data.Student;

	public class StudentsMain {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ApplicationContext ctx=new ClassPathXmlApplicationContext("Students.xml");
			StudentDaoImpl sdao=(StudentDaoImpl) ctx.getBean("stdao");
			
			Student st=new Student();
			
			List<Student> students =sdao.getStudents(); 
			Iterator<Student> itr=students.iterator();
			for(Student s:students)
			{
				System.out.println(s.getSname()+" "+s.getSid()+" " +s.getSage());
			}
		
			sdao.getStudents();

		}

	}