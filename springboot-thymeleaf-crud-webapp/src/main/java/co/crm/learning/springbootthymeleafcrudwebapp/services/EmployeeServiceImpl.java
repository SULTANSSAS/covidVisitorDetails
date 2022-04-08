package co.crm.learning.springbootthymeleafcrudwebapp.services;

import co.crm.learning.springbootthymeleafcrudwebapp.model.Employee;
import co.crm.learning.springbootthymeleafcrudwebapp.repository.EmployeeRepo;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepo repo;

    public EmployeeServiceImpl(EmployeeRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Employee> getAllStudents() {
        return repo.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return repo.findAllById(id);
    }

    @Override
    public void saveEmployee(Employee employee) {
        repo.save(employee);
    }
}
