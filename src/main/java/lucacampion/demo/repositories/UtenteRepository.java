package lucacampion.demo.repositories;

import lucacampion.demo.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente, Long> {

    // controllo duplicato
    boolean existsById(Long id);

}
