package co.crm.learning.springbootthymeleafcrudwebapp.controller;

import co.crm.learning.springbootthymeleafcrudwebapp.model.Employee;
import co.crm.learning.springbootthymeleafcrudwebapp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class EmployeeController {
    @Autowired
    private EmployeeService service;
    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("employees", service.getAllStudents());
            return "index";
        }
@GetMapping("/home/")
        public String showNewEmployeeForm(Model model){
        Employee employee=new Employee();
        model.addAttribute("employee",employee);
        return "employee_form";
        }

        public String saveEmployee(Model("emplo"))
    }

