package com.springdemo.opg1ensimpelregistreringsformular;// BrugerController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BrugerController {

    @Autowired
    private BrugerService brugerService;

    @GetMapping("/registrer")
    public String registreringsForm(Model model) {
        model.addAttribute("bruger", new Bruger());
        return "registrer";
    }

    @PostMapping("/registrer")
    public String submitRegistreringsForm(@ModelAttribute Bruger bruger, Model model) {
        brugerService.opretBruger(bruger);
        model.addAttribute("bruger", bruger);
        return "registrerings_resultat";
    }
}
