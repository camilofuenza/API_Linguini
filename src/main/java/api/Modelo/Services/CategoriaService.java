package api.Modelo.Services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api.Modelo.Dao.CategoriaDao;
import api.Modelo.Entities.Categorias;

@Service
public class CategoriaService {
	@Autowired
	CategoriaDao categoriaDao;

	
	@Transactional
	public List<Categorias> listarCategorias() {

		
        return (List<Categorias>)categoriaDao.findAll();
    }
	

	@Transactional
    public Categorias agregarCategoria(Categorias categoria) {
        return this.categoriaDao.saveAndFlush(categoria);
    }
	
	@Transactional
	public void eliminarCategoria(int idCategoria) {

		categoriaDao.deleteById(idCategoria);
	}
	
	@Transactional
	public Categorias buscarCategoria(int idCategoria) {
		return categoriaDao.findById(idCategoria).orElse(null);
	}
	
	@Transactional
	public Categorias guardarCategoria(Categorias categoria) {
        return this.categoriaDao.save(categoria);
    }


	
	
}
