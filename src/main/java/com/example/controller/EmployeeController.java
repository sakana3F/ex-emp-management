package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.domain.Employee;
import com.example.form.UpdateEmployeeForm;
import com.example.service.EmployeeService;

/**
 * @author harasawakana
 */

 /**
  * 従業員関連機能の処理の制御を⾏う 
  */

@Controller
@RequestMapping("/employee")

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    /**
     * 従業員一覧情報を表示 
     * */
    @GetMapping("/showList")
    public String showList(Model model) {
        model.addAttribute("employeeList", employeeService.showList());
        return "employee/list";
    }

    /**
     * 従業員情報を取得
     */
    @GetMapping("/showDetail")
    public String showDetail(String id, Model model, UpdateEmployeeForm form){
        int employeeId = Integer.parseInt(id);
        Employee employee = employeeService.showDetail(employeeId);
        model.addAttribute("employee", employee);
        return "employee/detail";
    }

}
