package lucacampion.demo.repositories;

import lucacampion.demo.entities.Postazione;
import lucacampion.demo.entities.TipologiaPostazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostazioneRepository extends JpaRepository<Postazione, Long> {

    // controllo duplicato
    boolean existsByDescrizione(String descrizione);


    // ricerca tramite tipologia postazione
    List<Postazione> findByTipologiaPostazione(TipologiaPostazione tipologiaPostazione);
}
