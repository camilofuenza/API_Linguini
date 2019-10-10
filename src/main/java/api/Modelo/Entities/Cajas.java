package api.Modelo.Entities;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="cajas")
public class Cajas  {

	/**
	 * 
	 */
	
	@Id
	@Column(name = "idcaja", nullable = false)
	@SequenceGenerator(name = "Caja_SEQ", sequenceName = "Caja_SEQ", allocationSize = 1, initialValue=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Caja_SEQ")
	private int idCaja;
	
	@Column(name = "ingresoscaja", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	private int ingresosCaja;

	public Cajas() {
		super();
	}
	
	public Cajas(int idCaja,  @NotEmpty(message = "El campo no puede estar vacío") int ingresosCaja) {
		super();
		this.idCaja = idCaja;
		this.ingresosCaja = ingresosCaja;
	}

	public int getIdCaja() {
		return idCaja;
	}

	public void setIdCaja(int idCaja) {
		this.idCaja = idCaja;
	}

	public int getIngresosCaja() {
		return ingresosCaja;
	}

	public void setIngresosCaja(int ingresosCaja) {
		this.ingresosCaja = ingresosCaja;
	}
	

	
	
	
	

}
