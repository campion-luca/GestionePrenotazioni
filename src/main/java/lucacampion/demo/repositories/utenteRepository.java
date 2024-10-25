package lucacampion.demo.repositories;

import lucacampion.demo.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface utenteRepository extends JpaRepository<Utente, Long> {


}
