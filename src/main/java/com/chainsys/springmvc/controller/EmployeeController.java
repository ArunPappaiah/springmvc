package com.chainsys.springmvc.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.springmvc.dao.EmployeeDao;
import com.chainsys.springmvc.pojo.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@GetMapping("/list")
	public String getAllEmployees(Model model) {
		List<Employee> empList = EmployeeDao.getAllEmployee();
		model.addAttribute("allemployees", empList);
		return "list-employees";
	}
	@GetMapping("/addform")
	public String showAddForm(Model model) {
		Employee theEmployee = new Employee();
		model.addAttribute("addemployee",theEmployee);
		return "add-employee-form";
	}
	@PostMapping("/add")
	public String addNewEmployee(@ModelAttribute("addemployee")Employee theEmployee) {
		EmployeeDao.insertEmployee(theEmployee);
		return "redirect:/employee/list";
	}
	@GetMapping("/updateform")
	public String showUpdateForm(@RequestParam("emp_id")int id,Model model) {
		Employee theEmp = EmployeeDao.getEmployeeById(id);
		model.addAttribute("updateemployee",theEmp);
		return "update-employee-form";
	}
	@PostMapping("/updateemp")
	public String updateEmployee(@ModelAttribute("updateemployee")Employee theEmployee) {
		EmployeeDao.updateEmployee(theEmployee);
		return "redirect:/employee/list";
	}
	@GetMapping("/deleteemployee")
	public String deleteEmployee(@RequestParam("emp_id")int id) {
		EmployeeDao.deleteEmployee(id);
		return "redirect:/employee/list";
	}
	@GetMapping("/findemployeebyid")
	public String findEmployeeById(@RequestParam("emp_id")int id,Model model) {
		Employee theEmp = EmployeeDao.getEmployeeById(id);
		model.addAttribute("findemployeebyid",theEmp);
		return "find-employee-by-id-form";
	}
}
