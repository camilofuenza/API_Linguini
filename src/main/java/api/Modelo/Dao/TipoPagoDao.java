package api.Modelo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.Modelo.Entities.TipoPago;

@Repository
public interface TipoPagoDao extends JpaRepository<TipoPago,Integer> {

}
