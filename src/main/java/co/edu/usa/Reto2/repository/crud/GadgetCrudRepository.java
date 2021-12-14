package co.edu.usa.Reto2.repository.crud;

import co.edu.usa.Reto2.model.Gadget;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GadgetCrudRepository extends MongoRepository<Gadget,Integer> {
}
