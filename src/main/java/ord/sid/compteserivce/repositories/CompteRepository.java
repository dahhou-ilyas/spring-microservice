package ord.sid.compteserivce.repositories;

import ord.sid.compteserivce.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte,Long> {
}
