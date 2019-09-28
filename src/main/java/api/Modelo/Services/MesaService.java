package api.Modelo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api.Modelo.Dao.MesaDao;
import api.Modelo.Entities.Mesas;

@Service
public class MesaService {
	
	@Autowired MesaDao mesaDao;
	

	@Transactional
	public Mesas listMesa(int idMesa) {
		return mesaDao.findById(idMesa).orElse(null);
	}
	
	@Transactional
	public Mesas saveMesa(Mesas mesa) {
        return this.mesaDao.save(mesa);
    }
	
	

}
