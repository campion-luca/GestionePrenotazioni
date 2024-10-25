package lucacampion.demo.repositories;

import lucacampion.demo.entities.Postazione;
import lucacampion.demo.entities.Prenotazione;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {


    boolean existsByIdAndDataPrenotazione(Long id, LocalDate dataPrenotazione);

    boolean existsByPostazioneAndDataPrenotazione(Postazione postazione, LocalDate dataPrenotazione);
}