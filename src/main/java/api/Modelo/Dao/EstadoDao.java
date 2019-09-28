package api.Modelo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.Modelo.Entities.Estados;

@Repository
public interface EstadoDao extends JpaRepository<Estados,Integer> {

}
