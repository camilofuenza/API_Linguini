package api.Modelo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api.Modelo.Dao.DetalleCartaDao;
import api.Modelo.Entities.DetalleCartas;

@Service
public class DetalleCartaService {

	
	@Autowired
	DetalleCartaDao detalleCartaDao;

	
	@Transactional
	public List<DetalleCartas> listarDetalleCartas() {

		return (List<DetalleCartas>)detalleCartaDao.findAll() ;

    }
	

	@Transactional
    public DetalleCartas agregarDetalleCarta(DetalleCartas detalleCartas) {
        return this.detalleCartaDao.saveAndFlush(detalleCartas);
    }
	

	
	@Transactional
	public DetalleCartas buscarDetalleCarta(int idDetalleCarta) {
		return detalleCartaDao.findById(idDetalleCarta).orElse(null);
	}

}
