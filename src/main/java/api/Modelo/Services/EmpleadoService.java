package api.Modelo.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api.Modelo.Dao.EmpleadoDao;
import api.Modelo.Entities.Empleados;

@Service
public class EmpleadoService {

	@Autowired
	EmpleadoDao empleadoDao;
	
	@Transactional
	public Empleados listEmpleado(int idEmpleado) {
		return empleadoDao.findById(idEmpleado).orElse(null);
	}
	
	@Transactional
	public List<Empleados> listarEmpleados(){
		
		
        return empleadoDao.findAll();
    }
	
	@Transactional
	public List<Empleados> listarMeseros(){
		
		
        return empleadoDao.listarMeseros();
    }
	
}
