package api.Modelo.Services;

import java.util.ArrayList;
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
	public List<Categorias> getAllCategorias() {

		List<Categorias> categorias= new ArrayList<Categorias>();
		
		for(Categorias a : (List<Categorias>)categoriaDao.findAll()) {
			Categorias c= new Categorias();
			c.idCategoria=(int)a.getIdCategoria();
			c.nombreCategoria=a.getNombreCategoria();
			categorias.add(c);
		}
		
        return categorias;
    }
	

	@Transactional
    public Categorias addCategoria(Categorias categoria) {
        return this.categoriaDao.saveAndFlush(categoria);
    }
	
	@Transactional
	public void deleteCategoria(int idCategoria) {

		categoriaDao.deleteById(idCategoria);
	}
	
	@Transactional
	public Categorias listCategoria(int idCategoria) {
		return categoriaDao.findById(idCategoria).orElse(null);
	}
	
	@Transactional
	public Categorias saveCategoria(Categorias categoria) {
        return this.categoriaDao.save(categoria);
    }


	
	
}
