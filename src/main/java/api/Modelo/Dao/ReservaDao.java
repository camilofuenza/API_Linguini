package api.Modelo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.Modelo.Entities.Reservas;

@Repository
public interface ReservaDao extends JpaRepository<Reservas, Integer>{

}
