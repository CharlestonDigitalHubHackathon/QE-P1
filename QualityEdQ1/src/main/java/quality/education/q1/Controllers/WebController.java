package quality.education.q1.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import quality.education.q1.Model.ProjectRepository;
import quality.education.q1.Model.Student;

import javax.validation.Valid;


@Controller
public class WebController {

    private ProjectRepository pr;

    public WebController() {
        pr = new ProjectRepository();
    }

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

    @RequestMapping(value = "/projects" ,method= RequestMethod.GET)
    public String showAll(Model model) {
        model.addAttribute("projects", pr.fidAll());
        return "projects";
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("student") Student student,
                         BindingResult result, ModelMap model) {
        if(result.hasErrors()){ return "error";}
        return "success";
    }




}
