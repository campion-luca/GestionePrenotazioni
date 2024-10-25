package lucacampion.demo.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="descrizione", nullable = false)
    private String descrizione;

    @Column(name = "tipo di postazione", nullable = false)
    private TipologiaPostazione tipologiaPostazione;

    @Column(name = "numero massimo partecipanti", nullable = false)
    private int numeroMaxPartecipanti;

    @Column(name = "stato", nullable = false)
    private StatoOccupazionale statoOccupazionale;

    // un edificio può contenere diverse postazioni, MANY
    // una postazione si trova dentro un solo edificio, ONE
    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;

    // un utente può prenotare diverse postazioni, MANY
    // una postazione può essere prenotata da diversi utenti, MANY
    @ManyToMany( mappedBy = "postazione")
    private List<Utente> utente;




    // costruttore
    public Postazione(String descrizione, Edificio edificio, int numeroMaxPartecipanti, StatoOccupazionale statoOccupazionale, TipologiaPostazione tipologiaPostazione, List<Utente> utente) {
        this.descrizione = descrizione;
        this.edificio = edificio;
        this.numeroMaxPartecipanti = numeroMaxPartecipanti;
        this.statoOccupazionale = statoOccupazionale;
        this.tipologiaPostazione = tipologiaPostazione;
        this.utente = utente;
    }


    // getter e setter
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumeroMaxPartecipanti() {
        return numeroMaxPartecipanti;
    }

    public void setNumeroMaxPartecipanti(int numeroMaxPartecipanti) {
        this.numeroMaxPartecipanti = numeroMaxPartecipanti;
    }

    public StatoOccupazionale getStatoOccupazionale() {
        return statoOccupazionale;
    }

    public void setStatoOccupazionale(StatoOccupazionale statoOccupazionale) {
        this.statoOccupazionale = statoOccupazionale;
    }

    public TipologiaPostazione getTipologiaPostazione() {
        return tipologiaPostazione;
    }

    public void setTipologiaPostazione(TipologiaPostazione tipologiaPostazione) {
        this.tipologiaPostazione = tipologiaPostazione;
    }

    public List<Utente> getUtente() {
        return utente;
    }

    public void setUtente(List<Utente> utente) {
        this.utente = utente;
    }


    // to string
    @Override
    public String toString() {
        return "Postazione{" +
                "descrizione='" + descrizione + '\'' +
                ", id=" + id +
                ", tipologiaPostazione=" + tipologiaPostazione +
                ", numeroMaxPartecipanti=" + numeroMaxPartecipanti +
                ", statoOccupazionale=" + statoOccupazionale +
                ", edificio=" + edificio +
                ", utente=" + utente +
                '}';
    }

}
