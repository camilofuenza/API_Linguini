package api.Modelo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.Modelo.Entities.Clientes;

@Repository
public interface ClienteDao extends JpaRepository<Clientes,String> {

}
