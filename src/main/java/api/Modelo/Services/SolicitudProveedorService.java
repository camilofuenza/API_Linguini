package api.Modelo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api.Modelo.Dao.SolicitudProveedorDao;
import api.Modelo.Entities.SolicitudProveedores;

@Service
public class SolicitudProveedorService {

	@Autowired
	SolicitudProveedorDao solicitudProveedorDao;

	
	@Transactional
	public List<SolicitudProveedores> listarSolicitudProveedores() {

		
        return (List<SolicitudProveedores>)solicitudProveedorDao.findAll();
    }
	

	@Transactional
    public SolicitudProveedores agregarSolicitudProveedor(SolicitudProveedores sp) {
        return this.solicitudProveedorDao.saveAndFlush(sp);
    }
	
	
	
	@Transactional
	public SolicitudProveedores buscarSolicitudProveedor(int idSolicitudProveedor) {
		return solicitudProveedorDao.findById(idSolicitudProveedor).orElse(null);
	}
	
	


	
}
