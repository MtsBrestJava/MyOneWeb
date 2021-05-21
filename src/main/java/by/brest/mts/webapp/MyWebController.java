package by.brest.mts.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyWebController {

    @Autowired
    HumanService humanService;

    @GetMapping("/")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="Meow") String name, Model model) {
        List<Human> humansList = humanService.getHumans();
        System.out.println("humans = " + humansList);
        model.addAttribute("name", name);
        model.addAttribute("humans", humansList);
        return "index";
    }

    @GetMapping("/addHuman")
    public String addHumanPage(Model model) {
        Human human = new Human();
        System.out.println("Humans add page loading...");
        model.addAttribute("human", human);
        return "addHuman";
    }

    @PostMapping("/addHuman")
    public String addHuman(Human human, BindingResult result) {
        System.out.println("Controller addHuman invoked");
        humanService.addHuman(human);
        return "redirect:/";
    }


}
