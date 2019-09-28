package api.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import api.Modelo.Entities.Empleados;
import api.Modelo.Entities.Estados;
import api.Modelo.Entities.Mesas;
import api.Modelo.Services.EmpleadoService;
import api.Modelo.Services.EstadoService;
import api.Modelo.Services.MesaService;


@RestController
@RequestMapping("/api/mesa")
@CrossOrigin(origins = { "http://localhost:4200" }, maxAge = 3600)

public class MesaController {
	
	@Autowired
	MesaService mesaService;
	
	@Autowired
	EmpleadoService empleadoService;
	
	@Autowired
	EstadoService estadoService;
	
	@PostMapping("/{idEstado}/{idEmpleado}/addmesa")
    public Mesas addMesa(@PathVariable (value = "idEstado") int idEstado,
    					@PathVariable (value="idEmpleado") int idEmpleado,
                                 @Valid @RequestBody Mesas mesa) {
		Empleados e= empleadoService.listEmpleado(idEmpleado);
		Estados est= estadoService.listEstado(idEstado);
        mesa.setEmpleados(e);
        mesa.setEstados(est);
  
            return mesaService.saveMesa(mesa);
       
    }

}
