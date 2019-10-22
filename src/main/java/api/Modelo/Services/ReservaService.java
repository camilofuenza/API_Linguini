package api.Modelo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api.Modelo.Dao.ReservaDao;
import api.Modelo.Entities.Reservas;

@Service
public class ReservaService {

	
	@Autowired 
	ReservaDao reservaDao;
	
	@Transactional
    public Reservas agregarReserva(Reservas reserva) {
        return this.reservaDao.saveAndFlush(reserva);
    }
	
	@Transactional
	public List<Reservas> listarReservas() {

		
        return (List<Reservas>)reservaDao.findAll();
    }
	


	
	@Transactional
	public Reservas buscarReserva(int idReserva) {
		return reservaDao.findById(idReserva).orElse(null);
	}
	
}
