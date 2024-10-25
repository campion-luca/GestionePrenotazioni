package lucacampion.demo.services;

import lombok.extern.slf4j.Slf4j;
import lucacampion.demo.entities.Edificio;
import lucacampion.demo.exceptions.NotFoundException;
import lucacampion.demo.exceptions.ValidationExceptions;
import lucacampion.demo.repositories.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EdificioService {
    @Autowired
    EdificioRepository edificioRepository;

    public void saveEdificio(Edificio edificio) {
        if(edificioRepository.existsByNome(edificio.getNome())) throw new ValidationExceptions("Sede già inserito, impossibile aggiungere duplicati !");
        edificioRepository.save(edificio);
        log.info("L'edificio " + edificio.getNome() + " è stato salvato correttamente!");
    }


    public Edificio findById(long id) {
        return edificioRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }
}
