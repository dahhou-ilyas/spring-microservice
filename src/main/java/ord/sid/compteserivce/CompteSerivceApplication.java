package ord.sid.compteserivce;

import ord.sid.compteserivce.entities.Compte;
import ord.sid.compteserivce.enums.TypeCompte;
import ord.sid.compteserivce.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.config.RepositoryConfiguration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class CompteSerivceApplication{

	public static void main(String[] args) {
		SpringApplication.run(CompteSerivceApplication.class, args);
	}


	//lorsque l'application démmare complétement il fait appelle a la methode run

	//au demarage touts les methode déclarer avec type Bean spring va l'executer
	@Bean
	CommandLineRunner start(CompteRepository compteRepository, RepositoryRestConfiguration restConfiguration){
		return args -> {
			restConfiguration.exposeIdsFor(Compte.class);
			compteRepository.save(new Compte(null,50000,new Date(), TypeCompte.COURANT));
			compteRepository.save(new Compte(null,90000,new Date(), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null,100000,new Date(), TypeCompte.COURANT));
			compteRepository.save(new Compte(null,72000,new Date(), TypeCompte.EPARGNE));
			compteRepository.findAll().forEach(cp->{
				System.out.println(cp.getCode());
				System.out.println(cp.getSolde());
				System.out.println(cp.getType());
				System.out.println("---------------------------------------");
			});
		};
	}

}
