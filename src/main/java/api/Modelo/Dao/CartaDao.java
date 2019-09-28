package api.Modelo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import api.Modelo.Entities.Carta;

@Repository
public interface CartaDao extends JpaRepository<Carta,Integer> {

@Query("select c from Carta c where c.categoria.nombreCategoria= 'Postres'") 
public List<Carta> listarPostres();

@Query("select c from Carta c where c.categoria.nombreCategoria= 'Fondos'") 
public List<Carta> listarFondos();

@Query("select c from Carta c where c.categoria.nombreCategoria= 'Bebestibles'") 
public List<Carta> listarBebestibles();
}
