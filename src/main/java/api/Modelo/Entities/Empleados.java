package api.Modelo.Entities;

import javax.persistence.*;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="empleados")
public class Empleados {

	@Column (name="idempleado")
	@Id
	@SequenceGenerator(name = "Empleado_SEQ", sequenceName = "Empleado_SEQ", allocationSize = 1, initialValue=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Empleado_SEQ")
	
	private int idEmpleado;
	
	@Column(name = "rutempleado", nullable = false)
	@Size(max=15)
	
	private String rutEmpleado;
	
	@Column(name = "nombreempleado", nullable = false)
	@Size(max=100)
	private String nombreEmpleado;
	
	@Column(name = "appaternoempleado", nullable = false)
	@Size(max=50)
	private String apPaternoEmpleado;
	
	@Column(name = "apmaternoempleado", nullable = false)
	@Size(max=50)
	private String apMaternoEmpleado;
	
	@Column(name = "direccionempleado", nullable = false)
	@Size(max=100)
	private String direccionEmpleado;
	
	@Column(name = "telefonoempleado", nullable = false)
	@Size(max=14)
	private String telefonoEmpleado;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
	@JoinColumn(name = "username")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Usuarios usuarios;
	
	public Empleados() {
		super();
	}


	public Empleados(int idEmpleado, @Size(max = 15) String rutEmpleado, @Size(max = 100) String nombreEmpleado,
			@Size(max = 50) String apPaternoEmpleado, @Size(max = 50) String apMaternoEmpleado,
			@Size(max = 100) String direccionEmpleado, @Size(max = 14) String telefonoEmpleado, Usuarios usuarios) {
		super();
		this.idEmpleado = idEmpleado;
		this.rutEmpleado = rutEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.apPaternoEmpleado = apPaternoEmpleado;
		this.apMaternoEmpleado = apMaternoEmpleado;
		this.direccionEmpleado = direccionEmpleado;
		this.telefonoEmpleado = telefonoEmpleado;
		this.usuarios = usuarios;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getRutEmpleado() {
		return rutEmpleado;
	}

	public void setRutEmpleado(String rutEmpleado) {
		this.rutEmpleado = rutEmpleado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getApPaternoEmpleado() {
		return apPaternoEmpleado;
	}

	public void setApPaternoEmpleado(String apPaternoEmpleado) {
		this.apPaternoEmpleado = apPaternoEmpleado;
	}

	public String getApMaternoEmpleado() {
		return apMaternoEmpleado;
	}

	public void setApMaternoEmpleado(String apMaternoEmpleado) {
		this.apMaternoEmpleado = apMaternoEmpleado;
	}

	public String getDireccionEmpleado() {
		return direccionEmpleado;
	}

	public void setDireccionEmpleado(String direccionEmpleado) {
		this.direccionEmpleado = direccionEmpleado;
	}

	public String getTelefonoEmpleado() {
		return telefonoEmpleado;
	}

	public void setTelefonoEmpleado(String telefonoEmpleado) {
		this.telefonoEmpleado = telefonoEmpleado;
	}

	public Usuarios getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}
	
	
	
	
	
	
	
}
