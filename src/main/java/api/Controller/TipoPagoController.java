package api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import api.Modelo.Entities.TipoPago;
import api.Modelo.Services.TipoPagoService;

@RestController
@RequestMapping("/api/tipoPago")
@CrossOrigin(origins = { "http://localhost:4200","http://localhost:8100" }, maxAge = 3600)

public class TipoPagoController {

	@Autowired
	TipoPagoService tipoPagoService;
	
	@RequestMapping(value = "/listarTipoPago", method = RequestMethod.GET)
	public List<TipoPago> listarTipoPago() {
		return tipoPagoService.listarTipoPago();
	}
	
}
