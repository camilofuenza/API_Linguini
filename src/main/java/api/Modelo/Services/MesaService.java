package api.Modelo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api.Modelo.Dao.MesaDao;
import api.Modelo.Entities.Mesas;

@Service
public class MesaService {
	
	@Autowired 
	MesaDao mesaDao;
	

	@Transactional
	public Mesas buscarMesa(int idMesa) {
		return mesaDao.findById(idMesa).orElse(null);
	}
	@Transactional
	public List<Mesas> listarMesa() {
		return (List<Mesas>)mesaDao.findAll();
	}
	
	@Transactional
	public Mesas agregarMesa(Mesas mesa) {
        return this.mesaDao.save(mesa);
    }
	
	@Transactional
	public List<Mesas> getMesasDisponibles(){
		
		return this.mesaDao.listarMesasDisponibles();
	}
	
	
	
	

}
