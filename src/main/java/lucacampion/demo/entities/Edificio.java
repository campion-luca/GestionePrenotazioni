package lucacampion.demo.entities;

import jakarta.persistence.*;

import java.util.List;

public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "indirizzo", nullable = false)
    private String indirizzo;

    @Column(name = "città", nullable = false)
    private String citta;

}
