package lucacampion.demo.services;

import lombok.extern.slf4j.Slf4j;
import lucacampion.demo.entities.Edificio;
import lucacampion.demo.entities.Utente;
import lucacampion.demo.exceptions.NotFoundException;
import lucacampion.demo.exceptions.ValidationExceptions;
import lucacampion.demo.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UtenteService {
    @Autowired
    UtenteRepository utenteRepository;

    public void saveUtente(Utente utente) {
        if(utenteRepository.existsById(utente.getId())) throw new ValidationExceptions("Sede già inserito, impossibile aggiungere duplicati !");
        utenteRepository.save(utente);
        log.info("L'utente " + utente.getNomeCompleto() + " è stato salvato correttamente!");
    }

    public Utente findById(long id) {
        return utenteRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }

}
