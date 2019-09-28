package api.Modelo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.Modelo.Entities.Producto;

@Repository
public interface ProductoDao extends JpaRepository<Producto, Integer> {

}
