package api.Modelo.Dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.Modelo.Entities.Categorias;

@Repository
public interface CategoriaDao extends JpaRepository<Categorias, Integer> {


}
