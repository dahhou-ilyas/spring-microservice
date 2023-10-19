package ord.sid.compteserivce.web;


//cette class cette la getway pour le service qui on a crée on ne peut pas utiliser RepositoryRestResource car pour commmuniquer à la couche service il faut utiliser un RestController

import ord.sid.compteserivce.dtos.VirmentRequestDTO;
import ord.sid.compteserivce.service.CompteService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {
    private CompteService compteService;


    //injection de dependecies
    public AccountRestController(CompteService compteService){
        this.compteService=compteService;
    }
    @PutMapping(path = "/comptes/virment")
    public void virment(VirmentRequestDTO request){

    }
}
