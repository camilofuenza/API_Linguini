package api.Modelo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import api.Modelo.Entities.Cartas;

@Repository
public interface CartaDao extends JpaRepository<Cartas,Integer> {

@Query("select c from Cartas c where c.categoria.nombreCategoria= 'Pastas'") 
public List<Cartas> listarPastas();

@Query("select c from Cartas c where c.categoria.nombreCategoria= 'Pizzas'") 
public List<Cartas> listarPizzas();

@Query("select c from Cartas c where c.categoria.nombreCategoria= 'Bebidas'") 
public List<Cartas> listarBebidas();
@Query("select c from Cartas c where c.categoria.nombreCategoria= 'Cervezas'") 
public List<Cartas> listarCervezas();
@Query("select c from Cartas c where c.categoria.nombreCategoria= 'Vinos'") 
public List<Cartas> listarVinos();
}
