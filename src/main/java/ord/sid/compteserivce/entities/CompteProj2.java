package ord.sid.compteserivce.entities;


import ord.sid.compteserivce.enums.TypeCompte;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "p2",types = Compte.class)
public interface CompteProj2 {
    public Date getDateCreation();
    public TypeCompte getType();
}
