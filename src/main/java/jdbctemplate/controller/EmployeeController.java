package jdbctemplate.controller;

import jdbctemplate.dao.EmployeeDao;
import jdbctemplate.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
public class EmployeeController {
        @Autowired
        private EmployeeDao employeeDao;

        @PostMapping("/saveEmployee")
        public String saveEmployee(@RequestBody Employee employee){
            String msg = employeeDao.save(employee);
            return msg;
        }

        @GetMapping("/findAll")
        public List<Employee> getAllEmployee(){
            return employeeDao.findAll();
        }

        @GetMapping("/findById/{userId}")
            public Employee findById(@PathVariable Long userId){
            return employeeDao.findById(userId);

       }

       @PutMapping("/updateEmployee/{userId}")
       public String update(@RequestBody Employee employee,@PathVariable Long userId){
            employeeDao.update(userId,employee);
            return "Record Updated SuccessFully!!!";
       }

        @DeleteMapping("/delete/{userId}")
           public String delete(@PathVariable Long userId){
            employeeDao.deleteById(userId);
            return "user Deleted SuccessFully";
       }

    }



