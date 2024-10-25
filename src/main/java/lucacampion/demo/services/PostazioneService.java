package lucacampion.demo.services;

import lombok.extern.slf4j.Slf4j;
import lucacampion.demo.entities.Postazione;
import lucacampion.demo.exceptions.ValidationExceptions;
import lucacampion.demo.repositories.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PostazioneService {
    @Autowired
    PostazioneRepository postazioneRepository;

    public void savePostazione(Postazione postazione) {
        if(postazioneRepository.existsByDescrizione(postazione.getDescrizione())) throw new ValidationExceptions("Postazione già inserita, impossibile aggiungere duplicati !");
        postazioneRepository.save(postazione);
        log.info("L'edificio " + postazione.getEdificio() + " è stato salvato correttamente!");
    }
}
