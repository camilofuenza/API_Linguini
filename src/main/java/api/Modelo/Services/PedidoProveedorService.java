package api.Modelo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api.Modelo.Dao.PedidoProveedorDao;
import api.Modelo.Entities.PedidosProveedor;

@Service
public class PedidoProveedorService {

	@Autowired
	PedidoProveedorDao pedidoProveedorDao;

	@Transactional
	public List<PedidosProveedor> listarPedidoProveedor() {

		
        return (List<PedidosProveedor>)pedidoProveedorDao.findAll();
    }
	


	
	@Transactional
	public PedidosProveedor buscarpedidoProveedor(int ordenCompra) {
		return pedidoProveedorDao.findById(ordenCompra).orElse(null);
	}
	
	

}
