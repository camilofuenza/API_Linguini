package api.Modelo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import api.Modelo.Entities.Carta;

@Repository
public interface CartaDao extends JpaRepository<Carta,Integer> {

@Query("select c from Carta c where c.categoria.nombreCategoria= 'Pastas'") 
public List<Carta> listarPastas();

@Query("select c from Carta c where c.categoria.nombreCategoria= 'Pizzas'") 
public List<Carta> listarPizzas();

@Query("select c from Carta c where c.categoria.nombreCategoria= 'Bebidas'") 
public List<Carta> listarBebidas();
@Query("select c from Carta c where c.categoria.nombreCategoria= 'Cervezas'") 
public List<Carta> listarCervezas();
@Query("select c from Carta c where c.categoria.nombreCategoria= 'Vinos'") 
public List<Carta> listarVinos();
}
