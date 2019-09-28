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

import api.Modelo.Entities.Carta;
import api.Modelo.Entities.Categorias;
import api.Modelo.Services.CartaService;
import api.Modelo.Services.CategoriaService;


@RestController
@RequestMapping("/api/carta")
@CrossOrigin(origins = { "http://localhost:4200" }, maxAge = 3600)
public class CartaController {

	@Autowired
	CartaService cartaService;
	
	@Autowired
	CategoriaService categoriaService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Carta> getAllCarta() {
		return cartaService.getAllCarta();
	}
	
	@RequestMapping(value = "/postres", method = RequestMethod.GET)
	public List<Carta> getAllPostres() {
		return cartaService.getPostres();
	}
	@RequestMapping(value = "/fondos", method = RequestMethod.GET)
	public List<Carta> getAllFondos() {
		return cartaService.getFondos();
	}
	@RequestMapping(value = "/bebestibles", method = RequestMethod.GET)
	public List<Carta> getAllBebestibles() {
		return cartaService.getBebestibles();
	}
	 
	
	@GetMapping(path= {"/{idCarta}"})
	public Carta listarCarta(@PathVariable("idCarta") int idCarta){
		return cartaService.listCarta(idCarta);
	}
	
	@PostMapping("/{idCategoria}/addcarta")
    public Carta addCarta(@PathVariable (value = "idCategoria") int idCategoria,
                                 @Valid @RequestBody Carta carta) {
        Categorias c= categoriaService.listCategoria(idCategoria);
        carta.setCategoria(c);
            return cartaService.addCarta(carta);
       
    }
	
	
}
