package api.Modelo.Entities;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="logs")
public class Logs{

	
	@Id
	@Column(name = "idlog", nullable = false)
	@SequenceGenerator(name = "Log_SEQ", sequenceName = "Log_SEQ", allocationSize = 1, initialValue=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Log_SEQ")
	
	private int idLog;
	
	@Column(name = "descripcionlog", nullable = false)
	@Size(max=100)
	@NotEmpty(message = "El campo no puede estar vacío")
	private String descripcionLog;
	
	@Column(name = "tipolog", nullable = false)
	@Size(max=100)
	@NotEmpty(message = "El campo no puede estar vacío")
	private String tipoLog;
	

	public Logs() {
		super();
	}

	
	
	public Logs(int idLog, String descripcionLog, String tipoLog) {
		super();
		this.idLog = idLog;
		this.descripcionLog = descripcionLog;
		this.tipoLog = tipoLog;
	}



	public int getIdLog() {
		return idLog;
	}



	public void setIdLog(int idLog) {
		this.idLog = idLog;
	}



	public String getDescripcionLog() {
		return descripcionLog;
	}



	public void setDescripcionLog(String descripcionLog) {
		this.descripcionLog = descripcionLog;
	}



	public String getTipoLog() {
		return tipoLog;
	}



	public void setTipoLog(String tipoLog) {
		this.tipoLog = tipoLog;
	}


}
