package ord.sid.compteserivce.dtos;

import lombok.Data;

@Data
public class VirmentRequestDTO {
    private Long codeSource;
    private Long codeDestination;
    private double montant;


}
