package api.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import api.Modelo.Entities.Cartas;
import api.Modelo.Entities.Estados;
import api.Modelo.Entities.Mesas;
import api.Modelo.Entities.Ordenes;
import api.Modelo.Entities.Usuarios;
import api.Modelo.Services.CartaService;
import api.Modelo.Services.EstadoService;
import api.Modelo.Services.MesaService;
import api.Modelo.Services.OrdenService;

@RestController
@RequestMapping("/api/orden")
@CrossOrigin(origins = { "http://localhost:4200","http://localhost:8100" }, maxAge = 3600)

public class OrdenController {

	
	@Autowired
	OrdenService ordenService;
	
	@Autowired 
	MesaService mesaService;
	
	@Autowired
	EstadoService estadoService;
	
	@Autowired
	CartaService cartaService;
	
	@RequestMapping(value = "/allOrdenLista", method = RequestMethod.GET)
	public List<Ordenes> getAllOrdenLista() {
		return ordenService.listOrdenesenLista();
	}
	
	@RequestMapping(value = "/allOrdenPreparacion", method = RequestMethod.GET)
	public List<Ordenes> getAllOrdenPreparacion() {
		return ordenService.listOrdenesenPreparacion();
	}
	
	@RequestMapping(value = "/allOrdenTerminada", method = RequestMethod.GET)
	public List<Ordenes> getAllOrdenTerminada() {
		return ordenService.listOrdenesenTerminada();
	}
	
	@GetMapping("/{idMesa}")
    public List<Ordenes> listarPedidos(@PathVariable (value = "idMesa") int idMesa
                                 ) {
        
        
            return ordenService.listarPedidos(idMesa);
       
    }
	@PutMapping(path= {"/{idOrden}"})
	public Ordenes modificiarOrden(@RequestBody Ordenes o,@PathVariable("idOrden") int idOrden) {
	o.setIdOrden(idOrden);
	return ordenService.agregarOrden(o);
	}
	
	
	
	@PostMapping("/{idEstado}/{idMesa}/{idCarta}/addorden")
	public Ordenes addOrden(@PathVariable (value="idMesa") int idMesa,
			@PathVariable (value="idEstado") int idEstado,
			@PathVariable (value="idCarta") int idCarta,
			@Valid @RequestBody Ordenes o) {
		Estados e= estadoService.listEstado(idEstado);
		o.setEstados(e);
		Mesas m= mesaService.buscarMesa(idMesa);
		Cartas c =cartaService.buscarCarta(idCarta);
		o.setCarta(c);
		
		System.out.println(e.getNombreEstado());
		o.setMesas(m);
		
		
		return ordenService.agregarOrden(o);
	}
	
	
}
