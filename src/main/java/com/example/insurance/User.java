package com.example.insurance;
import java.util.ArrayList;
public class User {
    public String email;
    public String name;
    public String IBAN;
    ArrayList<String> Insurances = new ArrayList<>();
    public User(String email, String name, String IBAN,  ArrayList<String>  Insurances) {
        this.email = email;
        this.name = name;
        this.IBAN = IBAN;
        this.Insurances = Insurances;


    }
}


