package admirwalker.github.com.springandreact.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // marks this class as MVC Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}
