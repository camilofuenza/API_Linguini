package api.Modelo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api.Modelo.Dao.EstadoDao;
import api.Modelo.Entities.Estados;

@Service
public class EstadoService {

	@Autowired
	EstadoDao estadoDao;
	
	@Transactional
	public Estados listEstado(int idEstado) {
		return estadoDao.findById(idEstado).orElse(null);
	}
}
