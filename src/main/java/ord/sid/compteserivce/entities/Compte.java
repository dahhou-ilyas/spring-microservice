package ord.sid.compteserivce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ord.sid.compteserivce.enums.TypeCompte;

import java.util.Date;


@Entity
@Data  @NoArgsConstructor @AllArgsConstructor
public class Compte {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long code;
    private double solde;
    private Date dateCreation;
    @Enumerated(EnumType.STRING)//en spécifier que la valeur dans cette colone soit COURANT ou EPARGNE
    // @Enumerated(EnumType.ORDINAL) en spécifier que la veur soit 0 ou 1 ...
    private TypeCompte type;
}
