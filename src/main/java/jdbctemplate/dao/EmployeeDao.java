package jdbctemplate.dao;

import jdbctemplate.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    String save(Employee e);
    List<Employee> findAll();
    Employee findById(Long id);
    int update(Long id,Employee e);
    void deleteById(Long id);

}
