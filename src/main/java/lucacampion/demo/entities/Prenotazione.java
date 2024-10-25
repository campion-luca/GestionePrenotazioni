package lucacampion.demo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDate dataPrenotazione;

    // una prenotazione riguarda una unica postazione, ONE
    // ma una postazione può avere più prenotazioni, MANY
    @ManyToOne
    @JoinColumn(name = "postazioneId")
    private Postazione postazione;

    // un utente può fare più prenotazioni, MANY
    // ma una prenotazione riguarda un unico utente, ONE
    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;


    public Prenotazione() {}

    // costruttore
    public Prenotazione(LocalDate localDate, Postazione postazione, Utente utente) {
        this.dataPrenotazione = localDate;
        this.postazione = postazione;
        this.utente = utente;
    }


    // getter e setter
    public LocalDate getDataPrenotazione() {
        return dataPrenotazione;
    }

    public void setDataPrenotazione(LocalDate dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Postazione getPostazione() {
        return postazione;
    }

    public void setPostazione(Postazione postazione) {
        this.postazione = postazione;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    // to string
    @Override
    public String toString() {
        return "Prenotazione{" +
                "dataPrenotazione=" + dataPrenotazione +
                ", id=" + id +
                ", postazione=" + postazione +
                ", utente=" + utente +
                '}';
    }
}
