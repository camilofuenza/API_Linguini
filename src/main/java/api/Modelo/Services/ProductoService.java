package api.Modelo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import api.Modelo.Dao.ProductoDao;
import api.Modelo.Entities.Producto;


@Service
public class ProductoService {
	@Autowired
	ProductoDao productoDao;
	
	
	@Transactional
	public List<Producto> getAllProductos() {
        return this.productoDao.findAll();
    }

	@Transactional
    public Producto addProducto(Producto producto) {
        return this.productoDao.save(producto);
    }
	
	@Transactional
	public void deleteProducto(int idProducto) {

		productoDao.deleteById(idProducto);
	}
	
	@Transactional
	public Producto listProducto(int idProducto) {
		return productoDao.findById(idProducto).orElse(null);
	}
	
	@Transactional
	public Producto saveProducto(Producto categoria) {
        return this.productoDao.save(categoria);
    }
}
