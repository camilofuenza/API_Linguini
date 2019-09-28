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

import api.Modelo.Entities.Producto;
import api.Modelo.Services.ProductoService;

@RestController
@RequestMapping("/api/producto")
@CrossOrigin(origins = { "http://localhost:4200" }, maxAge = 3600)

public class ProductoController {

	@Autowired
	ProductoService productoService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Producto> getAllProductos() {
		return productoService.getAllProductos();
	}

	@PostMapping("/addproducto")
	public Producto addProducto(@RequestBody Producto c) {
	
		
		return productoService.addProducto(c);
	}
	

	@DeleteMapping("/{deleteproducto}")
	public void deleteProducto(@PathVariable("deleteproducto") int idProducto) {
		
		productoService.deleteProducto(idProducto);
	}
	
	@GetMapping(path= {"/{idProducto}"})
	public Producto listarProducto(@PathVariable("idProducto") int idProducto){
		return productoService.listProducto(idProducto);
	}
	
	@PutMapping(path= {"/{idProducto}"})
		public Producto editarProducto(@RequestBody Producto c,@PathVariable("idProducto") int idProducto) {
		c.setIdProducto(idProducto);
		return productoService.saveProducto(c);
		}
}
