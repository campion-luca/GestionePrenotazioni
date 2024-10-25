package lucacampion.demo.services;

import lombok.extern.slf4j.Slf4j;
import lucacampion.demo.entities.Prenotazione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PrenotazioneService {
    @Autowired
    Prenotazione prenotazione;

}
