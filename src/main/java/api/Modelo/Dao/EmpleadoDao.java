package api.Modelo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.Modelo.Entities.Empleados;

@Repository
public interface EmpleadoDao extends JpaRepository<Empleados, Integer> {

}
