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

    // un utente può prenotare diverse postazioni, MANY
    // una postazione può essere prenotata da diversi utenti, MANY
    @ManyToMany
    @JoinTable(
            name = "postazione_utente",
            joinColumns = @JoinColumn (name = "utente_id", nullable = false),
            inverseJoinColumns = @JoinColumn (name = "postazione_id", nullable = false)
    )
    private List<Postazione> postazione;



    // costruttore
    public Utente(String email, String nomeCompleto, List<Postazione> postazione, String username) {
        this.email = email;
        this.nomeCompleto = nomeCompleto;
        this.postazione = postazione;
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

    public List<Postazione> getPostazione() {
        return postazione;
    }

    public void setPostazione(List<Postazione> postazione) {
        this.postazione = postazione;
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
                ", postazione=" + postazione +
                '}';
    }
}
