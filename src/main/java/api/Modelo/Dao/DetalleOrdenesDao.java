package api.Modelo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.Modelo.Entities.DetalleOrdenes;

@Repository
public interface DetalleOrdenesDao extends JpaRepository<DetalleOrdenes,Integer> {

}
