package lucacampion.demo.repositories;

import lucacampion.demo.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EdificioRepository extends JpaRepository<Edificio, Long> {


    // controllo duplicato
    boolean existsByNome(String nome);


}
