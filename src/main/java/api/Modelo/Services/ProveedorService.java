package api.Modelo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api.Modelo.Dao.ProveedorDao;
import api.Modelo.Entities.Proveedores;

@Service
public class ProveedorService {
	
	
	@Autowired
	ProveedorDao proveedorDao;

	@Transactional
	public List<Proveedores> listarProveedores() {

		
        return (List<Proveedores>)proveedorDao.findAll();
    }
	


	
	@Transactional
	public Proveedores buscarProveedor(int idProveedor) {
		return proveedorDao.findById(idProveedor).orElse(null);
	}
	
}
