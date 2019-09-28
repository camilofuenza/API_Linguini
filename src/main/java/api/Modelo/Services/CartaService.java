package api.Modelo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api.Modelo.Dao.CartaDao;
import api.Modelo.Entities.Carta;


@Service
public class CartaService {

	@Autowired
	CartaDao cartadao;
	
	@Transactional
	public List<Carta> getAllCarta() {
        return this.cartadao.findAll();
    }
	
	@Transactional
	public Carta listCarta(int idCarta) {
		return cartadao.findById(idCarta).orElse(null);
	}
	
	@Transactional
    public Carta addCarta(Carta carta) {
        return this.cartadao.save(carta);
    }
	
	@Transactional
	public List<Carta> getPostres(){
		
		return this.cartadao.listarPostres();
	}
	@Transactional
	public List<Carta> getFondos(){
		
		return this.cartadao.listarFondos();
	}
	@Transactional
	public List<Carta> getBebestibles(){
		
		return this.cartadao.listarBebestibles();
	}

}
