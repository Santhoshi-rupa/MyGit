package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import data.Student;

public class StudentDaoImpl implements IStudentDAO {
	
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	} 

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		String sql="select * from displayStudents";
		List<Student> lists=jdbcTemplate.query(sql,new RowMapper<Student>(){
			public Student mapRow(ResultSet rs,int rowNum) throws SQLException{
			Student stu=new Student();
			stu.setSname(rs.getString("sname"));
			stu.setSid(rs.getString("sid"));
			stu.setSage(rs.getInt("sage"));
			return stu;
			}
			});
			return lists;
		
	}

}