package lab.haze.SecurityMaster.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/regist")
    public String regist() {
        System.out.println("HERE!");
        return "regist";
    }

    @PostMapping("/regist")
    public String postRequest(@RequestParam("id") String id, @RequestParam("pass") String pass, Model model) {
        System.out.println("HERE!!");
        model.addAttribute("id", id);
        model.addAttribute("pass", pass);
        return "regcon";
    }

    @PostMapping("/login")
    public String loginPost() {
        return "redirect:/login-error";
    }
    
    @GetMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login";

        }
}
