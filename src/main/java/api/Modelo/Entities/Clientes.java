package api.Modelo.Entities;



import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="clientes")
public class Clientes{
	
	
	
	@Column(name="rutcliente", nullable = false)
	@Id
	private String rutCliente;
	
	@Column(name="nombrecliente", nullable = false)
	@Size(max=50)
	@NotEmpty(message = "El campo no puede estar vacío")
	private String nombreCliente;
	
	@Size(max=50)
	@NotEmpty(message = "El campo no puede estar vacío")
	@Column(name="appaternocliente", nullable = false)
	private String apPaternoCliente;
	
	@Size(max=50)
	@NotEmpty(message = "El campo no puede estar vacío")
	@Column(name="apmaternocliente", nullable = false)
	private String apMaternoCliente;
	
	@Size(max=15)
	@NotEmpty(message = "El campo no puede estar vacío")
	@Column(name="telefonocliente", nullable = false)
	private String telefonocliente ;

	
	public Clientes() {
		super();
	}
	
	
	public Clientes(String rutCliente,
			@Size(max = 50) @NotEmpty(message = "El campo no puede estar vacío") String nombreCliente,
			@Size(max = 50) @NotEmpty(message = "El campo no puede estar vacío") String apPaternoCliente,
			@Size(max = 50) @NotEmpty(message = "El campo no puede estar vacío") String apMaternoCliente,
			@Size(max = 15) @NotEmpty(message = "El campo no puede estar vacío") String telefonocliente) {
		super();
		this.rutCliente = rutCliente;
		this.nombreCliente = nombreCliente;
		this.apPaternoCliente = apPaternoCliente;
		this.apMaternoCliente = apMaternoCliente;
		this.telefonocliente = telefonocliente;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApPaternoCliente() {
		return apPaternoCliente;
	}

	public void setApPaternoCliente(String apPaternoCliente) {
		this.apPaternoCliente = apPaternoCliente;
	}

	public String getApMaternoCliente() {
		return apMaternoCliente;
	}

	public void setApMaternoCliente(String apMaternoCliente) {
		this.apMaternoCliente = apMaternoCliente;
	}

	public String getTelefonocliente() {
		return telefonocliente;
	}

	public void setTelefonocliente(String telefonocliente) {
		this.telefonocliente = telefonocliente;
	}

	
	

	
	
	
	
	
	

}
