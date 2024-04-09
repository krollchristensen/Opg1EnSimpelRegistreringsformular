package com.springdemo.opg1ensimpelregistreringsformular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Controller til at håndtere web requests relateret til brugere.
 * Anvender BrugerService til at oprette og håndtere brugere.
 */
@Controller
public class BrugerController {

    @Autowired
    private BrugerService brugerService;

    /**
     * Viser en formular for at registrere en ny bruger.
     * @param model Model objekt til at tilføje attributter, som kan bruges i viewet.
     * @return Navnet på HTML-skabelonen til at vise registreringsformularen.
     */
    @GetMapping("/registrer")
    public String registreringsForm(Model model) {
        model.addAttribute("bruger", new Bruger());
        return "registrer";
    }

    /**
     * Behandler indsendelsen af registreringsformularen.
     * @param bruger Den bruger, der er blevet oprettet fra formdata.
     * @param model Model objekt til at tilføje attributter, som kan bruges i viewet.
     * @return Navnet på HTML-skabelonen, der viser resultatet af registreringen.
     */
    @PostMapping("/registrer")
    public String submitRegistreringsForm(@ModelAttribute Bruger bruger, Model model) {
        brugerService.opretBruger(bruger);
        model.addAttribute("bruger", bruger);
        return "registrerings_resultat";
    }
}
