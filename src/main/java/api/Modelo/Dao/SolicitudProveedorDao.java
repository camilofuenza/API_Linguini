package api.Modelo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.Modelo.Entities.SolicitudProveedores;

@Repository
public interface SolicitudProveedorDao extends JpaRepository<SolicitudProveedores,Integer> {

}
