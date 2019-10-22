package api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import api.Modelo.Entities.Reservas;
import api.Modelo.Services.ReservaService;

@RestController
@RequestMapping("/api/reserva")
@CrossOrigin(origins = { "http://localhost:4200","http://localhost:8100" }, maxAge = 3600)

public class ReservaController {
	
	@Autowired
	ReservaService reservaService;

	@RequestMapping(value = "/listarReservas", method = RequestMethod.GET)
	public List<Reservas> listarReservas() {
		return reservaService.listarReservas();
	}
	
	@GetMapping(path= {"/{idReserva}"})
	public Reservas buscarReserva(@PathVariable("idReserva") int idReserva) {
	
	return reservaService.buscarReserva(idReserva);
	}


	@PostMapping("/agregarReserva")
	public Reservas agregarProducto(@RequestBody Reservas r) {
	
		
		return reservaService.agregarReserva(r);
	}
}
