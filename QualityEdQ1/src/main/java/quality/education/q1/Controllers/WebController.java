package quality.education.q1.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/")
    public String index() {
        return "index.html";
    }

    @RequestMapping("/Bobcats")
    public String bobcats() {
        return "Bobcats";
    }

    @RequestMapping("/pelicans")
    public String pelicans() {
        return "pelicans";
    }

    @RequestMapping("/turtles")
    public String turtles() {
        return "turtles";
    }
}
