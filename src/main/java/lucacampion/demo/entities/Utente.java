package lucacampion.demo.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="username", nullable = false)
    private String username;

    @Column(name="nome e cognome", nullable = false)
    private String nomeCompleto;

    @Column(name="e-mail", nullable = false)
    private String email;


    // costruttore
    public Utente(String email, String nomeCompleto, String username) {
        this.email = email;
        this.nomeCompleto = nomeCompleto;
        this.username = username;
    }

    // getter e setter
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // to string
    @Override
    public String toString() {
        return "Utente{" +
                "email='" + email + '\'' +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                '}';
    }
}
