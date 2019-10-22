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

import api.Modelo.Entities.Comprobantes;
import api.Modelo.Services.ComprobanteService;

@RestController
@RequestMapping("/api/comprobante")
@CrossOrigin(origins = { "http://localhost:4200","http://localhost:8100" }, maxAge = 3600)

public class ComprobanteController {
	
	@Autowired
	ComprobanteService comprobanteService;
	
	@RequestMapping(value = "/listarComprobantes", method = RequestMethod.GET)
	public List<Comprobantes> listarComprobantes() {
		return comprobanteService.listarComprobantes();
	}

	@PostMapping("/agregarComprobante")
	public Comprobantes agregarComprobante(@RequestBody Comprobantes c) {
		
		return comprobanteService.agregarComprobante(c);
	}
	

	@DeleteMapping("/{eliminarComprobante}")
	public void eliminarComprobante(@PathVariable("eliminarComprobante") int idComprobante) {
		
		comprobanteService.eliminarComprobante(idComprobante);
	}
	
	@GetMapping(path= {"/{idComprobante}"})
	public Comprobantes listarComprobante(@PathVariable("idComprobante") int idComprobante){
		return comprobanteService.buscarComprobante(idComprobante);
	}
	
	@PutMapping(path= {"/{idComprobante}"})
		public Comprobantes editarComprobante(@RequestBody Comprobantes c,@PathVariable("idComprobante") int idComprobante) {
		c.setIdComprobante(idComprobante);
		return comprobanteService.agregarComprobante(c);
		}
	

}
