package lucacampion.demo.entities;

import jakarta.persistence.*;

import java.util.List;

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
    @ManyToMany( mappedBy = "postazioni")
    private List<Utente> utente;

}
