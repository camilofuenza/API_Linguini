package api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import api.Modelo.Entities.PedidosProveedor;
import api.Modelo.Services.PedidoProveedorService;

@RestController
@RequestMapping("/api/pedidoProveedor")
@CrossOrigin(origins = { "http://localhost:4200","http://localhost:8100" }, maxAge = 3600)

public class PedidoProveedorController {

	
	@Autowired
	PedidoProveedorService pedidoProveedorService;

	@RequestMapping(value = "/listarPedidoProveedor", method = RequestMethod.GET)
	public List<PedidosProveedor> listarPedidoProveedor() {
		return pedidoProveedorService.listarPedidoProveedor();
	}
	
	@GetMapping(path= {"/{ordenCompra}"})
	public PedidosProveedor buscarPedidoProveedor(@PathVariable("ordenCompra") int ordenCompra) {
	
	return pedidoProveedorService.buscarpedidoProveedor(ordenCompra);
	}
}
