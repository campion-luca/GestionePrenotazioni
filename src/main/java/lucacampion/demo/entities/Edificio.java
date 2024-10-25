package lucacampion.demo.entities;

import jakarta.persistence.*;

@Entity
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


    public Edificio() {}

    // costruttore
    public Edificio(String citta, String indirizzo, String nome) {
        this.citta = citta;
        this.indirizzo = indirizzo;
        this.nome = nome;
    }


    // getter e setter
    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // to string
    @Override
    public String toString() {
        return "Edificio{" +
                "citta='" + citta + '\'' +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                '}';
    }


}


