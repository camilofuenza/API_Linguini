package api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import api.Modelo.Entities.Logs;
import api.Modelo.Services.LogsService;

@RestController
@RequestMapping("/api/logs")
@CrossOrigin(origins = { "http://localhost:4200","http://localhost:8100" }, maxAge = 3600)

public class LogsController {

	@Autowired
	LogsService logsService;
	
	@RequestMapping(value = "/listarLogs", method = RequestMethod.GET)
	public List<Logs> listarLogs() {
		return logsService.listarLogs();
	}
	
}
