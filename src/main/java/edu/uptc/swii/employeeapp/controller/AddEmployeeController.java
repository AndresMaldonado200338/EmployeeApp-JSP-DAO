package edu.uptc.swii.employeeapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;
import edu.uptc.swii.employeeapp.model.Employee;
import edu.uptc.swii.employeeapp.service.EmployeeDAOImpl;
import edu.uptc.swii.employeeapp.service.IEmployeeDAO;

@RestController
public class AddEmployeeController {
    private IEmployeeDAO employeeDAO = new EmployeeDAOImpl();

    @PostMapping("/save")
    public RedirectView addEmployee(Employee employee) {
        boolean res = this.employeeDAO.save(employee);
        if (!res)
            return new RedirectView("/error.html");
        else
            return new RedirectView("/confirm.html");
    }

    @GetMapping("/findbyid")
    public Employee findByID(@RequestParam String id) {
        return this.employeeDAO.findById(id);
    }

    @RequestMapping("/findall")
    public List<Employee> findAll() {
        return this.employeeDAO.findAll();
    }

    @PostMapping("/deletebyid")
    public boolean deleteEmployee(@RequestParam String id) {
        return this.employeeDAO.deleteEmployeeById(id);
    }

}
