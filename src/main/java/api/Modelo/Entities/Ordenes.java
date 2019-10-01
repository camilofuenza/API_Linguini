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
	
	

	public Ordenes(int idOrden, Mesas mesas, Date fechaEmisionOrden, Estados estados) {
		super();
		this.idOrden = idOrden;
		this.mesas = mesas;
		this.fechaEmisionOrden = fechaEmisionOrden;
		this.estados = estados;
	}



	public int getIdOrden() {
		return idOrden;
	}

	public void setIdOrden(int idOrden) {
		this.idOrden = idOrden;
	}

	public Mesas getMesas() {
		return mesas;
	}

	public void setMesas(Mesas mesas) {
		this.mesas = mesas;
	}

	public Date getFechaEmisionOrden() {
		return fechaEmisionOrden;
	}

	public void setFechaEmisionOrden(Date fechaEmisionOrden) {
		this.fechaEmisionOrden = fechaEmisionOrden;
	}

	public Estados getEstados() {
		return estados;
	}

	public void setEstados(Estados estados) {
		this.estados = estados;
	}

	
	
}
