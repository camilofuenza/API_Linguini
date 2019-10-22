package api.Modelo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import api.Modelo.Dao.ProductoDao;
import api.Modelo.Entities.Productos;


@Service
public class ProductoService {
	@Autowired
	ProductoDao productoDao;
	
	
	@Transactional
	public List<Productos> listarProductos() {
        return this.productoDao.findAll();
    }

	@Transactional
    public Productos addProducto(Productos producto) {
        return this.productoDao.save(producto);
    }
	
	@Transactional
	public void deleteProducto(int idProducto) {

		productoDao.deleteById(idProducto);
	}
	
	@Transactional
	public Productos listProducto(int idProducto) {
		return productoDao.findById(idProducto).orElse(null);
	}
	
	@Transactional
	public Productos saveProducto(Productos categoria) {
        return this.productoDao.save(categoria);
    }
}
