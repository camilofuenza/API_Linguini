package api.Modelo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.Modelo.Entities.DetalleCartas;


@Repository
public interface DetalleCartaDao extends JpaRepository<DetalleCartas,Integer> {

}
