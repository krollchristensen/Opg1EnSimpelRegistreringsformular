package com.springdemo.opg1ensimpelregistreringsformular;

// Bruger.java
public class Bruger {
    private String navn;
    private String email;

    // Constructors
    public Bruger() {}

    public Bruger(String navn, String email) {
        this.navn = navn;
        this.email = email;
    }

    // Getters og setters
    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
