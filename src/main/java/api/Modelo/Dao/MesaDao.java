package api.Modelo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.Modelo.Entities.Mesas;

@Repository
public interface MesaDao extends JpaRepository<Mesas, Integer> {

	
}
