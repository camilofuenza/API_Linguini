package api.Modelo.Entities;



import javax.persistence.*;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "bodegas")
public class Bodegas{

	/**
	 * 
	 */
	
	@Column(name="idbodega")
	@Id
	@SequenceGenerator(name = "Bodega_SEQ", sequenceName = "Bodega_SEQ", allocationSize = 1, initialValue=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Bodega_SEQ")
	private int idBodega;

	@Column(name = "nombrebodega", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	@Size(max = 20, message = "El nombre de la bodega debe ser menor a 50 caracteres")
	private String nombreBodega;

	@Column(name = "idempleado", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	private int idEmpleado;

	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE, orphanRemoval = true)
	@JoinColumn(name = "idsucursal")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Sucursales sucursales;
	
	public Bodegas() {
		super();
	}
	
	

	public Bodegas(int idBodega,
			@NotEmpty(message = "El campo no puede estar vacío") @Size(max = 20, message = "El nombre de la bodega debe ser menor a 50 caracteres") String nombreBodega,
			 @NotEmpty(message = "El campo no puede estar vacío") int idEmpleado, Sucursales sucursales) {
		super();
		this.idBodega = idBodega;
		this.nombreBodega = nombreBodega;
		this.idEmpleado = idEmpleado;
		this.sucursales = sucursales;
	}



	public int getIdBodega() {
		return idBodega;
	}

	public void setIdBodega(int idBodega) {
		this.idBodega = idBodega;
	}

	public String getNombreBodega() {
		return nombreBodega;
	}

	public void setNombreBodega(String nombreBodega) {
		this.nombreBodega = nombreBodega;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public Sucursales getSucursales() {
		return sucursales;
	}

	public void setSucursales(Sucursales sucursales) {
		this.sucursales = sucursales;
	}
	




}
