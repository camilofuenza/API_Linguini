package api.Modelo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api.Modelo.Dao.OrdenDao;
import api.Modelo.Entities.Ordenes;

@Service
public class OrdenService {
@Autowired 
OrdenDao ordenDao;

@Transactional
public List<Ordenes> listOrdenesenLista() {
	return ordenDao.listOrdenesenLista();
}

@Transactional
public List<Ordenes> listOrdenesenPreparacion() {
	return ordenDao.listOrdenesenPreparacion();
}

@Transactional
public List<Ordenes> listOrdenesenTerminada() {
	return ordenDao.listOrdenesTerminadas();
}

@Transactional
public List<Ordenes> listarPedidos(int idMesa) {
	return ordenDao.listarPedidos(idMesa);
}

@Transactional
public Ordenes agregarOrden(Ordenes orden) {
    return this.ordenDao.save(orden);
}

@Transactional
public List<Ordenes> listarOrden(Ordenes orden) {
    return this.ordenDao.findAll();
}
}
