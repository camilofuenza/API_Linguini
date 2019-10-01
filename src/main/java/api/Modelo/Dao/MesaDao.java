package api.Modelo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import api.Modelo.Entities.Mesas;

@Repository
public interface MesaDao extends JpaRepository<Mesas, Integer> {

	@Query("select m from Mesas m where m.estados.nombreEstado= 'Disponible'") 
	public List<Mesas> listarMesasDisponibles();
}
