package api.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import api.Modelo.Entities.Cartas;
import api.Modelo.Entities.Categorias;
import api.Modelo.Services.CartaService;
import api.Modelo.Services.CategoriaService;


@RestController
@RequestMapping("/api/carta")
@CrossOrigin(origins = { "http://localhost:4200","http://localhost:8100" }, maxAge = 3600)
public class CartaController {

	@Autowired
	CartaService cartaService;
	
	@Autowired
	CategoriaService categoriaService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Cartas> getAllCarta() {
		return cartaService.getAllCarta();
	}
	
	@RequestMapping(value = "/pastas", method = RequestMethod.GET)
	public List<Cartas> getAllPastas() {
		return cartaService.getPastas();
	}
	@RequestMapping(value = "/pizzas", method = RequestMethod.GET)
	public List<Cartas> getAllPizzas() {
		return cartaService.getPizzas();
	}
	@RequestMapping(value = "/bebidas", method = RequestMethod.GET)
	public List<Cartas> getAllBebidas() {
		return cartaService.getBebidas();
	}
	@RequestMapping(value = "/cervezas", method = RequestMethod.GET)
	public List<Cartas> getAllCervezas() {
		return cartaService.getCervezas();
	}
	@RequestMapping(value = "/vinos", method = RequestMethod.GET)
	public List<Cartas> getAllVinos() {
		return cartaService.getVinos();
	}
	 
	
	@GetMapping(path= {"/{idCarta}"})
	public Cartas listarCarta(@PathVariable("idCarta") int idCarta){
		return cartaService.listCarta(idCarta);
	}
	
	@PostMapping("/{idCategoria}/addcarta")
    public Cartas addCarta(@PathVariable (value = "idCategoria") int idCategoria,
                                 @Valid @RequestBody Cartas carta) {
        Categorias c= categoriaService.listCategoria(idCategoria);
        carta.setCategoria(c);
            return cartaService.addCarta(carta);
       
    }
	
	
}
