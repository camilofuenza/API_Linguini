package api.Modelo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import api.Modelo.Entities.Categorias;

@Repository
public interface CategoriaDao extends JpaRepository<Categorias, Integer> {

	/*@Query("select new api.Modelo.Entities.Categorias(c.idCategoria,c.nombreCategoria) from Categorias c ")
	List<Categorias> findAll();*/
	
}
