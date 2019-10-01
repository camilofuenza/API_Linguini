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
	
	@RequestMapping(value = "/allDisponibles", method = RequestMethod.GET)
	public List<Mesas> getAllMesasDisponibles() {
		return mesaService.getMesasDisponibles();
	}
	
	
    
	@CrossOrigin(origins =  "http://localhost:4200" , maxAge = 3600)

	@PutMapping(path= {"/{idEstado}/{idEmpleado}/{idMesa}"})
    public Mesas updateMesa(@RequestBody Mesas m,@PathVariable (value = "idEstado") int idEstado,
    					@PathVariable (value="idEmpleado") int idEmpleado,
    					@PathVariable (value="idMesa") int idMesa)
                                  {
		Empleados e= empleadoService.listEmpleado(idEmpleado);
		Estados est= estadoService.listEstado(idEstado);
		m=mesaService.listMesa(idMesa);
        m.setEmpleados(e);
        m.setEstados(est);
  
            return mesaService.saveMesa(m);
       
    }
	
	
	
	@GetMapping(path= {"/{idMesa}"})
	public Mesas listarMesa(@PathVariable("idMesa") int idMesa){
		return mesaService.listMesa(idMesa);
	}

}
