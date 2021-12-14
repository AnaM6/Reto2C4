package co.edu.usa.Reto2.web;

import co.edu.usa.Reto2.model.Gadget;
import co.edu.usa.Reto2.model.User;
import co.edu.usa.Reto2.service.GadgetService;
import co.edu.usa.Reto2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gadget")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class GadgetController {

    @Autowired
    private GadgetService gadgetService;

    @GetMapping("/all")
    public List<Gadget> getAll(){
        return gadgetService.getAll();
    }

   @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Gadget create(@RequestBody Gadget gadget){
        return gadgetService.create(gadget);
    }

    @PutMapping("/update")
    @ResponseStatus (HttpStatus.CREATED)
    public Gadget update(@RequestBody Gadget gadget){
        return gadgetService.update(gadget);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus (HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id){
        return gadgetService.delete(id);

    }
}
