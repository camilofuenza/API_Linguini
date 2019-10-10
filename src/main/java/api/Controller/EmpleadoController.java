package api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import api.Modelo.Entities.Empleados;
import api.Modelo.Services.EmpleadoService;

@RestController
@RequestMapping("/api/empleado")
@CrossOrigin(origins = { "http://localhost:4200","http://localhost:8100" }, maxAge = 3600)

public class EmpleadoController {
	

	@Autowired
	EmpleadoService empleadoService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Empleados> getAllUsers() {
		return empleadoService.getAllEmpleados();
	}
	
	@RequestMapping(value = "/meseros", method = RequestMethod.GET)
	public List<Empleados> getMeseros() {
		return empleadoService.listarMeseros();
	}

}
