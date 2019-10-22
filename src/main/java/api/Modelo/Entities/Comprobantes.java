package api.Modelo.Entities;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="comprobante")
public class Comprobantes {

	@Id
	@Column(name="idcomprobante", nullable = false)
	@SequenceGenerator(name = "Comprobante_SEQ", sequenceName = "Comprobante_SEQ", allocationSize = 1, initialValue=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Comprobante_SEQ")
	
	private int idComprobante;
	
	@Column (name="idorden", nullable=false)
	private int idOrden;
	
	@Column (name="totalcomprobante", nullable=false)
	
	private int totalComprobante;
	
	@Column (name="fechaemisioncomprobante", nullable=false)
	@JsonFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date fechaEmisionComprobante;
	
	

	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE, orphanRemoval = true)
	@JoinColumn(name = "idtipopago")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private TipoPago tipoPago;

	public Comprobantes() {
		super();
	}


	public Comprobantes(int idComprobante, int idOrden, int totalComprobante,
			Date fechaEmisionComprobante, TipoPago tipoPago) {
		super();
		this.idComprobante = idComprobante;
		this.idOrden = idOrden;
		this.totalComprobante = totalComprobante;
		this.fechaEmisionComprobante = fechaEmisionComprobante;
		this.tipoPago = tipoPago;
	}



	public int getIdComprobante() {
		return idComprobante;
	}



	public void setIdComprobante(int idComprobante) {
		this.idComprobante = idComprobante;
	}



	public int getIdOrden() {
		return idOrden;
	}



	public void setIdOrden(int idOrden) {
		this.idOrden = idOrden;
	}



	public int getTotalComprobante() {
		return totalComprobante;
	}



	public void setTotalComprobante(int totalComprobante) {
		this.totalComprobante = totalComprobante;
	}



	public Date getFechaEmisionComprobante() {
		return fechaEmisionComprobante;
	}



	public void setFechaEmisionComprobante(Date fechaEmisionComprobante) {
		this.fechaEmisionComprobante = fechaEmisionComprobante;
	}



	public TipoPago getTipoPago() {
		return tipoPago;
	}



	public void setTipoPago(TipoPago tipoPago) {
		this.tipoPago = tipoPago;
	}
	
	
	
	
}
