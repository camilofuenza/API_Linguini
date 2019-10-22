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
import api.Modelo.Entities.DetalleCartas;
import api.Modelo.Services.ComprobanteService;
import api.Modelo.Services.DetalleCartaService;

@RestController
@RequestMapping("/api/detalleCarta")
@CrossOrigin(origins = { "http://localhost:4200","http://localhost:8100" }, maxAge = 3600)

public class DetalleCartaController {
	

	@Autowired
	DetalleCartaService detalleCartaService;
	
	@RequestMapping(value = "/listarDetalleCartas", method = RequestMethod.GET)
	public List<DetalleCartas> listarDetalleCartas() {
		return detalleCartaService.listarDetalleCartas();
	}

	@PostMapping("/agregarDetalleCartas")
	public DetalleCartas agregarDetalleCarta(@RequestBody DetalleCartas dc) {
		
		return detalleCartaService.agregarDetalleCarta(dc);
	}
	

	//@DeleteMapping("/{eliminarComprobante}")
	//public void eliminarComprobante(@PathVariable("eliminarComprobante") int idComprobante) {
		
	//	detalleCartaService.eliminarComprobante(idComprobante);
	//}
	
	@GetMapping(path= {"/{idDetalleCartas}"})
	public DetalleCartas buscarDetalleCartas(@PathVariable("idDetalleCartas") int idDetalleCarta){
		return detalleCartaService.buscarDetalleCarta(idDetalleCarta);
	}
	
	@PutMapping(path= {"/{idDetalleCarta}"})
		public DetalleCartas editarDetalleCarta(@RequestBody DetalleCartas dc,@PathVariable("idDetalleCarta") int idDetalleCarta) {
		dc.setIdDetalleCarta(idDetalleCarta);
		return detalleCartaService.agregarDetalleCarta(dc);
		}
	


}
