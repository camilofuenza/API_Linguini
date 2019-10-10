package api.Modelo.Dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import api.Modelo.Entities.Usuarios;

@Repository
public interface UsuarioDao extends JpaRepository<Usuarios,String> {

	@Query("select u from Usuarios u where u.username= ?1 and u.password= ?2") 
	public Usuarios verifyUsuario(String username, String password);
	
	
}
