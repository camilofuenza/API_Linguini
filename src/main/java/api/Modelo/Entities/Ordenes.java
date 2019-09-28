package api.Modelo.Entities;


import java.util.Date;

import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="ordenes")
public class Ordenes{


	@Column(name = "idorden", nullable = false)
	@Id
	@SequenceGenerator(name = "Orden_SEQ", sequenceName = "Orden_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Orden_SEQ")
	private int idOrden;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idmesa")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Mesas mesas;
	
	@Column(name = "fechaemisionorden", nullable = false)
	@JsonFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date fechaEmisionOrden;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idestado")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Estados estados;
	
	public Ordenes() {
		super();
	}

	public Ordenes(int idOrden, Mesas mesa, Date fechaEmisionOrden, Estados estado) {
		super();
		this.idOrden = idOrden;
		this.mesas = mesa;
		this.fechaEmisionOrden = fechaEmisionOrden;
		this.estados = estado;
	}

	public int getIdOrden() {
		return idOrden;
	}

	public void setIdOrden(int idOrden) {
		this.idOrden = idOrden;
	}

	public Mesas getMesa() {
		return mesas;
	}

	public void setMesa(Mesas mesa) {
		this.mesas = mesa;
	}

	public Date getFechaEmisionOrden() {
		return fechaEmisionOrden;
	}

	public void setFechaEmisionOrden(Date fechaEmisionOrden) {
		this.fechaEmisionOrden = fechaEmisionOrden;
	}

	public Estados getEstado() {
		return estados;
	}

	public void setEstado(Estados estado) {
	}

	
	
}
