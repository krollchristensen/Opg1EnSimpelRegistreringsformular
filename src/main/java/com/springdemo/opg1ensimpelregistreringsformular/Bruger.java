package com.springdemo.opg1ensimpelregistreringsformular;

/**
 * En simpel domæneklasse, der repræsenterer en bruger.
 * Denne klasse holder på brugerens informationer såsom navn og email.
 */
public class Bruger {
    private String navn;
    private String email;

    /**
     * Standard tom konstruktør.
     * Nødvendig for Spring's databinding.
     */
    public Bruger() {}

    /**
     * Konstruktør til at initialisere en bruger med navn og email.
     * @param navn Brugerens navn.
     * @param email Brugerens email.
     */
    public Bruger(String navn, String email) {
        this.navn = navn;
        this.email = email;
    }

    // Getter og setter metoder til at tilgå og opdatere brugerens navn og email.

    public String getNavn() { return navn; }

    public void setNavn(String navn) { this.navn = navn; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }
}
