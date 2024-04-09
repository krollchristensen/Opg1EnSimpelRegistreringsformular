package com.springdemo.opg1ensimpelregistreringsformular;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * Serviceklasse til at håndtere logikken for brugeroperationer.
 * Gemmer brugere i en midlertidig liste som en form for "database".
 */
@Service
public class BrugerService {
    private static final List<Bruger> brugere = new ArrayList<>();

    /**
     * Tilføjer en ny bruger til listen.
     * @param bruger Brugeren der skal tilføjes.
     */
    public void opretBruger(Bruger bruger) {
        brugere.add(bruger);
    }

    /**
     * Returnerer en liste af alle brugere.
     * Kan bruges til at vise eller teste brugerliste.
     * @return En liste af brugere.
     */
    public List<Bruger> hentAlleBrugere() {
        return brugere;
    }
}
