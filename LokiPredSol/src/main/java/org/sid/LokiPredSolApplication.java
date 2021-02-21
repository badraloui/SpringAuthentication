package org.sid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import org.springframework.context.ApplicationContext;
//import org.sid.dao.RoleRepository;
//import org.sid.dao.UserRepository;
//import org.sid.entities.Role;
//import org.sid.entities.User;

@SpringBootApplication
public class LokiPredSolApplication {
	public static void main(String[] args) {
		SpringApplication.run(LokiPredSolApplication.class, args);

		//OFDetailRepository ofdr = ctx.getBean(OFDetailRepository.class);
		//I will show the first colon of the OFDetail table
		//ofdr.findAll().forEach(op->System.out.println(op.getAcf_fleet()));
		
		//J'ajoute les admins j'exécute une seule fois et je met en commentaire 
//		ApplicationContext ctx =  SpringApplication.run(LokiPredSolApplication.class, args);
//		UserRepository usrep = ctx.getBean(UserRepository.class);
//		usrep.save(new User("Badre-Dine","ALOUI","badreddinealoui1@gmail.com","badr123"));
//		usrep.save(new User("Mohamed Achref","BEN JAZIA","mohamedachref.benjazia@esprit.tn","achref123"));
//		usrep.save(new User("Axel","RENARD","axel.renard.ing@gmail.com","axel123"));
//		usrep.save(new User("Amir","DHIBI","amir10.dhibi@gmail.com","amir123"));
//		usrep.save(new User("Eric","PELEGRIS","pelegris.eric@orange.fr","eric123"));
//		usrep.save(new User("Emmanuel","MACRON","emmanule.macron@elysee.fr","emmanuel123"));

//		RoleRepository rorep = ctx.getBean(RoleRepository.class);
//		rorep.save(new Role("ADMIN"));
//		rorep.save(new Role("USER"));		
//
	}

}
