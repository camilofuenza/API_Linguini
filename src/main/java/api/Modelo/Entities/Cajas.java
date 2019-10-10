package api.Modelo.Entities;


import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="cajas")
public class Cajas  {

	/**
	 * 
	 */
	
	@Column(name="idcaja")
	@Id
	@SequenceGenerator(name = "Caja_SEQ", sequenceName = "Caja_SEQ", allocationSize = 1, initialValue=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Caja_SEQ")
	private int idCaja;
	
	@Column(name = "ingresoinicialcaja", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	private int ingresoInicialCaja;
	
	@Column(name = "descuentovuelto", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	private int descuentoVuelto;
	
	@Column(name = "sumatotalcomprobante", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	private int sumatotalcomprobante;
	
	@Column(name = "fecha", nullable = false)
	@JsonFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date fecha;

	public Cajas() {
		super();
	}
	
	

	public Cajas(int idCaja, @NotEmpty(message = "El campo no puede estar vacío") int ingresoInicialCaja,
			@NotEmpty(message = "El campo no puede estar vacío") int descuentoVuelto,
			@NotEmpty(message = "El campo no puede estar vacío") int sumatotalcomprobante, Date fecha) {
		super();
		this.idCaja = idCaja;
		this.ingresoInicialCaja = ingresoInicialCaja;
		this.descuentoVuelto = descuentoVuelto;
		this.sumatotalcomprobante = sumatotalcomprobante;
		this.fecha = fecha;
	}



	public int getIdCaja() {
		return idCaja;
	}

	public void setIdCaja(int idCaja) {
		this.idCaja = idCaja;
	}

	public int getIngresoInicialCaja() {
		return ingresoInicialCaja;
	}

	public void setIngresoInicialCaja(int ingresoInicialCaja) {
		this.ingresoInicialCaja = ingresoInicialCaja;
	}

	public int getDescuentoVuelto() {
		return descuentoVuelto;
	}

	public void setDescuentoVuelto(int descuentoVuelto) {
		this.descuentoVuelto = descuentoVuelto;
	}

	public int getSumatotalcomprobante() {
		return sumatotalcomprobante;
	}

	public void setSumatotalcomprobante(int sumatotalcomprobante) {
		this.sumatotalcomprobante = sumatotalcomprobante;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
