package co.crm.learning.springbootthymeleafcrudwebapp.services;

import co.crm.learning.springbootthymeleafcrudwebapp.model.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface EmployeeService {

    List<Employee> getAllStudents();
    Employee getEmployeeById(Long id);
    void saveEmployee(Employee employee);


}
