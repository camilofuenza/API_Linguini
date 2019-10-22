package api.Modelo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api.Modelo.Dao.LogsDao;
import api.Modelo.Entities.Logs;

@Service
public class LogsService {
	
@Autowired
LogsDao logsDao;
	
	@Transactional
	public List<Logs> listarLogs() {

		
        return (List<Logs>)logsDao.findAll();
    }

}
