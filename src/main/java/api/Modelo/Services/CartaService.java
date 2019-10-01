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
	public List<Carta> getPastas(){
		
		return this.cartadao.listarPastas();
	}
	@Transactional
	public List<Carta> getPizzas(){
		
		return this.cartadao.listarPizzas();
	}
	@Transactional
	public List<Carta> getBebidas(){
		
		return this.cartadao.listarBebidas();
	}
	@Transactional
	public List<Carta> getCervezas(){
		
		return this.cartadao.listarCervezas();
	}
	@Transactional
	public List<Carta> getVinos(){
		
		return this.cartadao.listarVinos();
	}
	

}
