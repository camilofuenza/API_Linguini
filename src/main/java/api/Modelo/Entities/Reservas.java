package api.Modelo.Entities;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "reservas")
public class Reservas {

	/**
	 * 
	 */

	@Id
	@Column(name = "idreserva", nullable = false)
	 @SequenceGenerator(name = "Reserva_SEQ", sequenceName = "Reserva_SEQ", allocationSize = 1, initialValue=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Reserva_SEQ")
   
	private int idReserva;
	
	@Column(name = "rutcliente", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	@Size(max=15)
	private String rutCliente;
	
	@Column(name = "nombrecliente", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	@Size(max=50)
	private String nombreCliente;
	
	@Column(name = "appaternocliente", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	@Size(max=50)
	private String apPaternoCliente;

	@Column(name = "apmaternocliente", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	@Size(max=50)
	private String apMaternoCliente;

	@Column(name = "fechaemisionreserva", nullable = false)
	@JsonFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date fechaEmisionReserva;

	@Column(name = "fechareserva", nullable = false)
	@JsonFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date fechaReserva;

	@Column(name = "cantidadpersonas", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	private int cantidadPersonas;

	@Column(name = "telefonocliente", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	@Size(max=15)
	private String telefonoCliente;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
	@JoinColumn(name = "idmesa")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Mesas mesas;
	
	public Reservas() {
		super();
	}
	
	

	public Reservas(int idReserva,
			@NotEmpty(message = "El campo no puede estar vacío") @Size(max = 15) String rutCliente,
			@NotEmpty(message = "El campo no puede estar vacío") @Size(max = 50) String nombreCliente,
			@NotEmpty(message = "El campo no puede estar vacío") @Size(max = 50) String apPaternoCliente,
			@NotEmpty(message = "El campo no puede estar vacío") @Size(max = 50) String apMaternoCliente,
			Date fechaEmisionReserva, Date fechaReserva,
			@NotEmpty(message = "El campo no puede estar vacío") int cantidadPersonas,
			@NotEmpty(message = "El campo no puede estar vacío") @Size(max = 15) String telefonoCliente, Mesas mesas) {
		super();
		this.idReserva = idReserva;
		this.rutCliente = rutCliente;
		this.nombreCliente = nombreCliente;
		this.apPaternoCliente = apPaternoCliente;
		this.apMaternoCliente = apMaternoCliente;
		this.fechaEmisionReserva = fechaEmisionReserva;
		this.fechaReserva = fechaReserva;
		this.cantidadPersonas = cantidadPersonas;
		this.telefonoCliente = telefonoCliente;
		this.mesas = mesas;
	}



	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
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

	public Date getFechaEmisionReserva() {
		return fechaEmisionReserva;
	}

	public void setFechaEmisionReserva(Date fechaEmisionReserva) {
		this.fechaEmisionReserva = fechaEmisionReserva;
	}

	public Date getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public int getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

	public String getTelefonoCliente() {
		return telefonoCliente;
	}

	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}

	public Mesas getMesas() {
		return mesas;
	}

	public void setMesas(Mesas mesas) {
		this.mesas = mesas;
	}
	
	

	

}
