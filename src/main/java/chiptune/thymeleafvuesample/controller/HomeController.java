package chiptune.thymeleafvuesample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/{version}")
    public String index(
            @PathVariable String version,
            Model model) {
        model.addAttribute("title", "Home Page");
        return version + "/index";
    }
}
