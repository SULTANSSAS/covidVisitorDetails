package co.crm.learning.springbootthymeleafcrudwebapp.repository;

import co.crm.learning.springbootthymeleafcrudwebapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {


    Employee findAllById(Long id);

}
