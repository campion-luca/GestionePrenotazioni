package lucacampion.demo;

import lucacampion.demo.entities.*;
import lucacampion.demo.services.EdificioService;
import lucacampion.demo.services.PostazioneService;
import lucacampion.demo.services.PrenotazioneService;
import lucacampion.demo.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Component
public class PrenotationRunner implements CommandLineRunner {
    @Autowired
    private EdificioService edificioService;
    @Autowired
    private PostazioneService postazioneService;
    @Autowired
    private UtenteService utenteService;
    @Autowired
    private PrenotazioneService prenotazioneService;



    @Override
    public void run(String... args) throws Exception {

        // ----------------------- POPOLAMENTO DEL DB -----------------------
// ---------- AGGIUNTA EDIFICIO -----------
//        Edificio succursale = new Edificio("Rovigo","via Roma 82","ROMA82");
//        Edificio sede = new Edificio("Roma","viale Monte Magno 15","LUPA27");
//        Edificio estero1 = new Edificio("Parigi", "cal du le mond 45/A", "BAGUETTE88");
//        Edificio commerciali = new Edificio("Milano", "via del corso 45", "DUOMO22");

//        edificioService.saveEdificio(sede);



// ---------- AGGIUNTA POSTAZIONE -----------
//        Edificio succ = edificioService.findById(1);
//        Edificio sed = edificioService.findById(2);
//        Edificio est1 = edificioService.findById(3);
//        Edificio com = edificioService.findById(4);
//
//        Postazione p1 = new Postazione("Grande bello e luminoso", succ, 5, true, TipologiaPostazione.OPENSPACE);
//        Postazione p2 = new Postazione("Piccolo ma accogliente",sed,2,true,TipologiaPostazione.PRIVATO);
//        Postazione p3 = new Postazione("Grande sala perfetta per le riunioni",est1,30,true,TipologiaPostazione.SALA_RIUNIONI);
//        Postazione p4 = new Postazione("Grande sala per il lavoro di gruppo",com,6,true,TipologiaPostazione.PRIVATO);
//
//
//        postazioneService.savePostazione(p1);
//        postazioneService.savePostazione(p2);
//        postazioneService.savePostazione(p3);
//        postazioneService.savePostazione(p4);



// ---------- AGGIUNTA UTENTE -----------
//        Utente u1 = new Utente("campionluca@gmail.com","campion luca", "LUCA27");
//        Utente u2 = new Utente("aldobaglio@gmail.com", "Aldo Baglio", "TERUN66");
//        Utente u3 = new Utente("giovannistorti@gmail.com","Giovanni Storti","GIOVA00");
//        Utente u4 = new Utente("giacomino@gmail.com","Giacomo Poretti","GIACOMINO11");
//
//
//        utenteService.saveUtente(u1);
// ---------------------------------------------------------------------
// ---------------------CREAZIONE PRENOTAZIONE + CONTROLLO PER DATA E PRENOTAZIONE GIA EFFETTUATA-------------------------
// ---------------------------------------------------------------------

//        // accedo al DB per prendermi le postazioni
//        Postazione pt1 = postazioneService.findById(1);
//        Postazione pt2 = postazioneService.findById(2);
//        Postazione pt3 = postazioneService.findById(3);
//        Postazione pt4 = postazioneService.findById(4);
//
//
//        // accedo al DB per prendermi gli utenti
//        Utente ut1 = utenteService.findById(1);
//        Utente ut2 = utenteService.findById(2);
//        Utente ut3 = utenteService.findById(3);
//        Utente ut4 = utenteService.findById(4);
//
//
//        Prenotazione p1 = new Prenotazione(LocalDate.of(2024,11,20),pt2,ut1);

//        prenotazioneService.savePrenotazione(p1);


// ---------------------------------------------------------------------
// ---------------------------------------------------------------------
// ---------------------------------------------------------------------

        postazioneService.findByTipo(TipologiaPostazione.PRIVATO).forEach(System.out::println);
    }
}
