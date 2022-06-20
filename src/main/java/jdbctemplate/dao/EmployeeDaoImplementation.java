package jdbctemplate.dao;

import jdbctemplate.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Repository
@Service
public class EmployeeDaoImplementation implements EmployeeDao {

    @Autowired
   private JdbcTemplate jdbcTemplate;

    String insertQuery="Insert into employee(name,location,department) values(?,?,?)";
    String findAll = "select * from employee";
    String findById = "select * from employee where id = ?";
    String deleteById = " delete from employee where id = ?";
    String updateRecord = " update employee set name=?,location=?,department=? where id = ?";

    @Override
    public String save(Employee e) {

      jdbcTemplate.update(insertQuery, new Object[]{e.getName(),e.getLocation(),e.getDepartment()});
        return "Data Saved Successfully!!";
    }

    @Override
    public List<Employee> findAll() {
        return jdbcTemplate.query(findAll,new BeanPropertyRowMapper<>(Employee.class));
    }

    @Override
    public Employee findById(Long id) {
        return jdbcTemplate.queryForObject(findById,new BeanPropertyRowMapper<>(Employee.class),id);
    }

    @Override
    public int update(Long id, Employee e) {

         return jdbcTemplate.update(updateRecord,new Object[]{e.getName(),e.getLocation(),e.getDepartment(),id});
    }

    @Override
    public void deleteById(Long id) {
        jdbcTemplate.update(deleteById,id);
    }




}
