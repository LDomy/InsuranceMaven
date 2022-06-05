package models;

public class Adminisztrator extends Person {
    private String username;
    private String jelszo;

    public Adminisztrator(String nev, String email, String username, String jelszo) {
        super(nev, email);
        this.username = username;
        this.jelszo = jelszo;
    }
}
