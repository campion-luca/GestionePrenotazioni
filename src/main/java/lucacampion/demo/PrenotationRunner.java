package lucacampion.demo;

import lucacampion.demo.entities.Utente;
import lucacampion.demo.services.EdificioService;
import lucacampion.demo.services.PostazioneService;
import lucacampion.demo.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PrenotationRunner implements CommandLineRunner {
    @Autowired
    private EdificioService edificioService;
    @Autowired
    private PostazioneService postazioneService;
    @Autowired
    private UtenteService utenteService;


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




// ---------- AGGIUNTA UTENTE -----------
//        Utente u1 = new Utente("campionluca@gmail.com","campion luca", "LUCA27");
//        Utente u2 = new Utente("aldobaglio@gmail.com", "Aldo Baglio", "TERUN66");
//        Utente u3 = new Utente("giovannistorti@gmail.com","Giovanni Storti","GIOVA00");
//        Utente u4 = new Utente("giacomino@gmail.com","Giacomo Poretti","GIACOMINO11");
//
//
//        utenteService.saveUtente(u1);
// ---------------------------------------------------------------------
    }
}
