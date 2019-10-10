package api.Modelo.Entities;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="tipopago")
public class TipoPago  {


	@Id
	@Column(name="idtipopago", nullable = false)
	@SequenceGenerator(name = "TipoPago_SEQ", sequenceName = "TipoPago_SEQ", allocationSize = 1, initialValue=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="TipoPago_SEQ")
	
	private int idTipoPago;
	
	@Column (name="descripciontipopago", nullable=false)
	@NotEmpty(message = "El campo no puede estar vacío")
	@Size(max=80)
	private String descripcionTipoPago;
	
	public TipoPago() {
		super();
	}
	
	public TipoPago(int idTipoPago, String descripcionTipoPago) {
		super();
		this.idTipoPago = idTipoPago;
		this.descripcionTipoPago = descripcionTipoPago;
	}


	public int getIdTipoPago() {
		return idTipoPago;
	}


	public void setIdTipoPago(int idTipoPago) {
		this.idTipoPago = idTipoPago;
	}


	public String getDescripcionTipoPago() {
		return descripcionTipoPago;
	}


	public void setDescripcionTipoPago(String descripcionTipoPago) {
		this.descripcionTipoPago = descripcionTipoPago;
	}


	

	
	
}
