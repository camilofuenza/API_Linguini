package api.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import api.Modelo.Entities.Usuarios;
import api.Modelo.Services.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
@CrossOrigin(origins = { "http://localhost:4200","http://localhost:8100" }, maxAge = 3600)
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("/{username}/{password}")
    public Usuarios addCarta(@PathVariable (value = "username") String username,
                                 @PathVariable (value="password") String password) {
        
        
            return usuarioService.verifyUsuario(username, password);
       
    }

}
