package api.Modelo.Services;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import api.Modelo.Dao.UsuarioDao;
import api.Modelo.Entities.Usuarios;

@Service
public class UsuarioService {

	
	
	@Autowired
	UsuarioDao usuarioDao;
	
	
	
	public Usuarios verifyUsuario(String username, String password) {
		if(usuarioDao.verifyUsuario(username, password) != null) {
			return usuarioDao.verifyUsuario(username, password);
		}else {
			return null;
		}
		
		
	}
	
	
}
