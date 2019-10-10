package api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import api.Modelo.Entities.Categorias;
import api.Modelo.Services.CategoriaService;

@RestController
@RequestMapping("/api/categoria")
@CrossOrigin(origins = { "http://localhost:4200","http://localhost:8100" }, maxAge = 3600)

public class CategoriaController {

	@Autowired
	CategoriaService categoriaService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Categorias> getAllUsers() {
		return categoriaService.getAllCategorias();
	}

	@PostMapping("/addcategoria")
	public Categorias addCategoria(@RequestBody Categorias c) {
		
		return categoriaService.addCategoria(c);
	}
	

	@DeleteMapping("/{deletecategoria}")
	public void deleteCategoria(@PathVariable("deletecategoria") int idCategoria) {
		
		categoriaService.deleteCategoria(idCategoria);
	}
	
	@GetMapping(path= {"/{idCategoria}"})
	public Categorias listarCategoria(@PathVariable("idCategoria") int idCategoria){
		return categoriaService.listCategoria(idCategoria);
	}
	
	@PutMapping(path= {"/{idCategoria}"})
		public Categorias editarCategoria(@RequestBody Categorias c,@PathVariable("idCategoria") int idCategoria) {
		c.setIdCategoria(idCategoria);
		return categoriaService.saveCategoria(c);
		}
	

}
