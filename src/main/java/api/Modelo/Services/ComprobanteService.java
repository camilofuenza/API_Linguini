package api.Modelo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import api.Modelo.Dao.ComprobanteDao;
import api.Modelo.Entities.Comprobantes;



public class ComprobanteService {

	@Autowired
	ComprobanteDao comprobanteDao;

	
	@Transactional
	public List<Comprobantes> listarComprobantes() {

		
        return (List<Comprobantes>)comprobanteDao.findAll();
    }
	

	@Transactional
    public Comprobantes agregarComprobante(Comprobantes comprobante) {
        return this.comprobanteDao.saveAndFlush(comprobante);
    }
	
	@Transactional
	public void eliminarComprobante(int idComprobante) {

		comprobanteDao.deleteById(idComprobante);
	}
	
	@Transactional
	public Comprobantes buscarComprobante(int idComprobante) {
		return comprobanteDao.findById(idComprobante).orElse(null);
	}
	
	


}
