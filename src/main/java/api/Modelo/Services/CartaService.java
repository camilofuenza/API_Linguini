package api.Modelo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api.Modelo.Dao.CartaDao;
import api.Modelo.Entities.Cartas;


@Service
public class CartaService {

	@Autowired
	CartaDao cartadao;
	
	@Transactional
	public List<Cartas> getAllCarta() {
        return this.cartadao.findAll();
    }
	
	@Transactional
	public Cartas listCarta(int idCarta) {
		return cartadao.findById(idCarta).orElse(null);
	}
	
	@Transactional
    public Cartas addCarta(Cartas carta) {
        return this.cartadao.save(carta);
    }
	
	@Transactional
	public List<Cartas> getPastas(){
		
		return this.cartadao.listarPastas();
	}
	@Transactional
	public List<Cartas> getPizzas(){
		
		return this.cartadao.listarPizzas();
	}
	@Transactional
	public List<Cartas> getBebidas(){
		
		return this.cartadao.listarBebidas();
	}
	@Transactional
	public List<Cartas> getCervezas(){
		
		return this.cartadao.listarCervezas();
	}
	@Transactional
	public List<Cartas> getVinos(){
		
		return this.cartadao.listarVinos();
	}
	

}
