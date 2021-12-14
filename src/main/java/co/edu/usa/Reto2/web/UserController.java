package co.edu.usa.Reto2.web;

import co.edu.usa.Reto2.model.User;
import co.edu.usa.Reto2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class UserController {
    @Autowired
    /**
     * Variable de UserService
     */
    private UserService userService;

    @GetMapping("/all")
    /**
     * Función para traer todos los elementos de user
     */
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/emailexist/{email}")
    /**
     * Función para verificar que existe el email
     */
    public boolean existeEmail(@PathVariable("email") String email){
        return userService.existEmail(email);
    }

    @GetMapping("/{email}/{password}")
    /**
     * Función para autenticar usuario
     */
    public User autenticarUser(@PathVariable("email") String email,@PathVariable("password") String password){
        return userService.authenticateUser(email,password);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    /**
     * Función para guardar un usuario
     */
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    @PutMapping("/update")
    @ResponseStatus (HttpStatus.CREATED)
    /**
     * Función para actualizar usuario
     */
    public User update(@RequestBody User user){
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus (HttpStatus.NO_CONTENT)
    /**
     * Función para borrar usuario
     */
    public boolean delete(@PathVariable("id") int id){
        return userService.delete(id);

    }





}
