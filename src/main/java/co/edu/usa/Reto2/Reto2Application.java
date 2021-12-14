package co.edu.usa.Reto2;

import co.edu.usa.Reto2.model.User;
import co.edu.usa.Reto2.repository.crud.GadgetCrudRepository;
import co.edu.usa.Reto2.repository.crud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Reto2Application  implements CommandLineRunner {
	@Autowired
	private UserCrudRepository userCrudR;

	@Autowired
	private GadgetCrudRepository gadgetCrudR;

	public static void main(String[] args) {
		SpringApplication.run(Reto2Application.class, args);
	}

	/*
	Esto es para que cuando inicie no tenga datos y guardar
	 */
	@Override
	public void run(String... args) throws Exception {
		userCrudR.deleteAll();
		gadgetCrudR.deleteAll();

		/**
		 *

		userCrudR.saveAll(List.of(
				new User( 1, "123123", "CARLOS ALBERTO GARCIA", "CR 34-45", "311222222", "cgarcia@gmail.com","Demo123.", "ZONA 2", "ADM"),
				new User( 2, "456456", "FELIPE PAEZ", "CR 9-45", "321222222", "fpaez@gmail.com","Demo345.", "ZONA 1", "CO0R")

		));

		System.out.println("Listado de usuarios");
		userCrudR.findAll().forEach(System.out::println);

		Optional<User> usuario = userCrudR.findByEmail("fpaez@gmail.com");

		if(usuario.isEmpty()){
			System.out.println(usuario.get());
		}

		Optional<User> usuarioPas = userCrudR.findByEmailAndPassword("fpaez@gmail.com", "Demo345.");

		if(usuarioPas.isEmpty()){
			System.out.println(usuarioPas.get());
		}
		 */
	}
}
