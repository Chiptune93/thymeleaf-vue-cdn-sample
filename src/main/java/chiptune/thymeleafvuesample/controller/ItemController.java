package chiptune.thymeleafvuesample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ItemController {

    @GetMapping("/items")
    public String items(Model model) {
        List<String> itemList = Arrays.asList("Item 1", "Item 2", "Item 3", "Item 4");
        model.addAttribute("items", itemList);
        model.addAttribute("title", "Item List");
        return "items";
    }
}
