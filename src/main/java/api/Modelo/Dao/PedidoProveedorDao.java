package api.Modelo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.Modelo.Entities.PedidosProveedor;

@Repository
public interface PedidoProveedorDao extends JpaRepository<PedidosProveedor,Integer> {

}
