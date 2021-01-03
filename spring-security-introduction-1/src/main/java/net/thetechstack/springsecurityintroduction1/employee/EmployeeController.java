package net.thetechstack.springsecurityintroduction1.employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class EmployeeController {
    @GetMapping("/employees")
    public String all(Model model, Principal principal) {
        model.addAttribute("userName", principal.getName());
        return "employees";
    }
}
