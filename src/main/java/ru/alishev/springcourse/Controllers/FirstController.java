package ru.alishev.springcourse.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    // при get запросе на hello gelangen wir in diese Methode

    // Hier möchten wir die Seite der View zurückgeben, die dem Benutzer gezeigt werden soll
    // Diese zwei Homepages werden in dem Ordner first liegen
    @GetMapping("/hello")
    public String helloPage(){
    return "first/hello";
    }
@GetMapping("/goodbye")
    public String goodByePage(){
    return "first/goodbye";
    }

}
