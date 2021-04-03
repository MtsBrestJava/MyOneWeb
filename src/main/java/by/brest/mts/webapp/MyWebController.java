package by.brest.mts.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyWebController {

    @Autowired
    HumanService humanService;

    @RequestMapping("/")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="Meow") String name, Model model) {
        List<Human> humansList = humanService.getHumans();
        System.out.println("humans = " + humansList);
        model.addAttribute("name", name);
        model.addAttribute("humans", humansList);
        return "index";
    }

    @RequestMapping("/addHuman")
    public String greeting(Model model) {
        Human human = null;
        System.out.println("Humans add page loading...");
        model.addAttribute("human", human);
        return "addHuman";
    }



}
