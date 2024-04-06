package com.springdemo.opg1ensimpelregistreringsformular;// BrugerService.java
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BrugerService {
    private static final List<Bruger> brugere = new ArrayList<>();

    public void opretBruger(Bruger bruger) {
        brugere.add(bruger);
    }

    // Metode til at hente alle brugere - kan bruges til test
    public List<Bruger> hentAlleBrugere() {
        return brugere;
    }
}
