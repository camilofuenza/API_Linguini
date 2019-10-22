package api.Modelo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.Modelo.Entities.Comprobantes;


@Repository
public interface ComprobanteDao extends JpaRepository<Comprobantes, Integer> {

}
