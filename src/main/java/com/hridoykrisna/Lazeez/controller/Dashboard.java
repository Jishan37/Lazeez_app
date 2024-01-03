package com.hridoykrisna.Lazeez.controller;

import com.hridoykrisna.Lazeez.Utils.CommonUtils;
import com.hridoykrisna.Lazeez.repository.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ControllerAdvice
@RequiredArgsConstructor
@RequestMapping("/dashboard")
public class Dashboard {
    private final EmployeeRepo employeeRepo;

    @GetMapping
    public String dashboard(Model model) {
        if (CommonUtils.isAdminAuthenticate) {
            model.addAttribute("currentUserName", CommonUtils.employee.getName());
            long totalEmp = employeeRepo.count();
            int totalDriver = employeeRepo.getTotalDriver("DRIVER");
            model.addAttribute("totalEmployee", totalEmp);
            model.addAttribute("totalDriver", totalDriver);
            model.addAttribute("totalOfficer", totalEmp - totalDriver);
            return "dashboard.html";
        } else {
            return "redirect:login";
        }
    }
}
