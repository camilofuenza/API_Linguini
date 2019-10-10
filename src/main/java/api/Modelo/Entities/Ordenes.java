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
	@SequenceGenerator(name = "Orden_SEQ", sequenceName = "Orden_SEQ", allocationSize = 1, initialValue=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Orden_SEQ")
	private int idOrden;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
	@JoinColumn(name = "idmesa")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Mesas mesas;
	
	@Column(name = "fechaemisionorden", nullable = false)
	@JsonFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date fechaEmisionOrden;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
	@JoinColumn(name = "idestado")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Estados estados;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
	@JoinColumn(name = "idcarta")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Cartas carta;
	
	public Ordenes() {
		super();
	}
	
	

	public Ordenes(int idOrden, Mesas mesas, Date fechaEmisionOrden, Estados estados, Cartas carta) {
		super();
		this.idOrden = idOrden;
		this.mesas = mesas;
		this.fechaEmisionOrden = fechaEmisionOrden;
		this.estados = estados;
		this.carta = carta;
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

	public Cartas getCarta() {
		return carta;
	}

	public void setCarta(Cartas carta) {
		this.carta = carta;
	}

		

	
	
}
