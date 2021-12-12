package com.learning.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
//        Employee emp = new Employee();
//        emp.setName("Ivan");
//        emp.setSurname("Petrov");
//        emp.setSalary(500);
        model.addAttribute("employee", new Employee());
        return "ask-emp-detail-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult) {
//        String name = emp.getName();
//        emp.setName("Mr. " + name);
//
//        String surname = emp.getSurname();
//        emp.setSurname(surname + "!");
//
//        int salary = emp.getSalary();
//        emp.setSalary(salary * 10);
//        System.out.println("surname lenght = " + emp.getSurname().length()); for @NotNull annotation
        if (bindingResult.hasErrors()) {
            return "ask-emp-detail-view";
        } else {
            return "show-emp-details-view";
        }
    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails() {
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//
//        model.addAttribute("description", " -  udemy student");
//
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model) {
//        empName = "Mr. " + empName + " !";
//        model.addAttribute("nameAttribute", empName);
//        return "show-emp-details-view";
//    }
}
