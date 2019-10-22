package api.Modelo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.Modelo.Entities.Proveedores;

@Repository
public interface ProveedorDao extends JpaRepository<Proveedores,Integer> {

	
}
