package lucacampion.demo.services;

import lombok.extern.slf4j.Slf4j;
import lucacampion.demo.entities.Prenotazione;
import lucacampion.demo.exceptions.ValidationExceptions;
import lucacampion.demo.repositories.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PrenotazioneService {
    @Autowired
    PrenotazioneRepository prenotazioneRepository;


    public void savePrenotazione(Prenotazione prenotazione) {
        if(prenotazioneRepository.existsByIdAndDataPrenotazione(prenotazione.getUtente().getId(), prenotazione.getDataPrenotazione())) {
            throw new ValidationExceptions("Hai già una prenotazione per questa data!");
        } else if(prenotazioneRepository.existsByPostazioneAndDataPrenotazione(prenotazione.getPostazione(), prenotazione.getDataPrenotazione())) {
            throw new ValidationExceptions("La postazione risulta già occupata!");
        }
        prenotazioneRepository.save(prenotazione);
        log.info("La tua prenotazione è avvenuta con successo!");
    }
}
