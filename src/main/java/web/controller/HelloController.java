package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HelloController {


    @GetMapping("/")
    public RedirectView redirectToUsers() {
        return new RedirectView("/users");
    }
}
