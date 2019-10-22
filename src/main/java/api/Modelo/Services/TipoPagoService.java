package api.Modelo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api.Modelo.Dao.TipoPagoDao;
import api.Modelo.Entities.TipoPago;

@Service
public class TipoPagoService {
	
	@Autowired
	TipoPagoDao tipoPagoDao;
	
	@Transactional
	public List<TipoPago> listarTipoPago() {

		
        return (List<TipoPago>)tipoPagoDao.findAll();
    }
}
