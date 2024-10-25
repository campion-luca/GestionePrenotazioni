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

    @Column(name = "tipologiaPostazione", nullable = false)
    private TipologiaPostazione tipologiaPostazione;

    @Column(name = "numero massimo partecipanti", nullable = false)
    private int numeroMaxPartecipanti;

    // un edificio può contenere diverse postazioni, MANY
    // una postazione si trova dentro un solo edificio, ONE
    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;


    public Postazione() {}

    // costruttore
    public Postazione(String descrizione, Edificio edificio, int numeroMaxPartecipanti, TipologiaPostazione tipologiaPostazione) {
        this.descrizione = descrizione;
        this.edificio = edificio;
        this.numeroMaxPartecipanti = numeroMaxPartecipanti;
        this.tipologiaPostazione = tipologiaPostazione;
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

    public TipologiaPostazione getTipologiaPostazione() {
        return tipologiaPostazione;
    }

    public void setTipologiaPostazione(TipologiaPostazione tipologiaPostazione) {
        this.tipologiaPostazione = tipologiaPostazione;
    }

    // to string
    @Override
    public String toString() {
        return "Postazione{" +
                "descrizione='" + descrizione + '\'' +
                ", id=" + id +
                ", tipologiaPostazione=" + tipologiaPostazione +
                ", numeroMaxPartecipanti=" + numeroMaxPartecipanti +
                ", edificio=" + edificio +
                '}';
    }

}
