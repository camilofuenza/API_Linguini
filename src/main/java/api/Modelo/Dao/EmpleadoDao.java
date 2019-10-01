package api.Modelo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import api.Modelo.Entities.Empleados;

@Repository
public interface EmpleadoDao extends JpaRepository<Empleados, Integer> {

	@Query("select e from Empleados e where e.usuarios.roles.nombreRol= 'Mesero'")
	public List <Empleados> listarMeseros();
}
