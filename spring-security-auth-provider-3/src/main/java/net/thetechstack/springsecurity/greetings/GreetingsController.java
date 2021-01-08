package net.thetechstack.springsecurity.greetings;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class GreetingsController {
    @GetMapping("/greeting")
    public String all(Model model, Principal principal) {
        model.addAttribute("userName", principal.getName());
        return "greeting";
    }
}
