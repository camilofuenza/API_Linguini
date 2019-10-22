package api.Modelo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import api.Modelo.Dao.ClienteDao;
import api.Modelo.Entities.Clientes;

@Service
public class ClienteService {

	
	@Autowired
	ClienteDao clienteDao;

	
	@Transactional
	public List<Clientes> listarClientes() {
		return (List<Clientes>)clienteDao.findAll();
		}
		
     




}
