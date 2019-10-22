package api.Modelo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import api.Modelo.Entities.Logs;

public interface LogsDao extends JpaRepository<Logs,Integer> {
	
	

}
