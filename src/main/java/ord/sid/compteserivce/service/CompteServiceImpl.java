package ord.sid.compteserivce.service;


import ord.sid.compteserivce.entities.Compte;
import ord.sid.compteserivce.repositories.CompteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional //cette annotation permet de rendre tout les methode transactionelle c'est à dire sans besoin de faire save le save fait automatiquement lors de la finition de la methode si passe sans aucun error
public class CompteServiceImpl implements CompteService {
    private CompteRepository compteRepository;

    public CompteServiceImpl(CompteRepository compteRepository){
        this.compteRepository=compteRepository;
    }
    @Override
    public void virment(Long codeSource, Long codeDestination, double montant) {
        Compte c1=compteRepository.getById(codeSource);
        Compte c2=compteRepository.getById(codeDestination);
        c1.setSolde(c1.getSolde()-montant);
        c2.setSolde(c2.getSolde()+montant);
        compteRepository.save(c1);
        compteRepository.save(c2);
    }
}
