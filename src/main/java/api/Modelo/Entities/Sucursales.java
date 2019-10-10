package api.Modelo.Entities;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="sucursales")
public class Sucursales{

	
	@Id
	@Column(name = "idsucursal", nullable = false)
	@SequenceGenerator(name = "Sucursal_SEQ", sequenceName = "Sucursal_SEQ", allocationSize = 1, initialValue=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Sucursal_SEQ")
	private int idSucursal;
	
	@Column(name = "nombresucursal", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	@Size(max=30)
	private String nombreSucursal;
	
	@Column(name = "direccionsucursal", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	@Size(max=30)
	private String direccionSucursal;
	

	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE, orphanRemoval = true)
	@JoinColumn(name = "idcomuna")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Comunas Comunas;

	public Sucursales() {
		super();
	}

	public Sucursales(int idSucursal,
			@NotEmpty(message = "El campo no puede estar vacío") @Size(max = 30) String nombreSucursal,
			@NotEmpty(message = "El campo no puede estar vacío") @Size(max = 30) String direccionSucursal,
			api.Modelo.Entities.Comunas comunas) {
		super();
		this.idSucursal = idSucursal;
		this.nombreSucursal = nombreSucursal;
		this.direccionSucursal = direccionSucursal;
		Comunas = comunas;
	}



	public int getIdSucursal() {
		return idSucursal;
	}



	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}



	public String getNombreSucursal() {
		return nombreSucursal;
	}



	public void setNombreSucursal(String nombreSucursal) {
		this.nombreSucursal = nombreSucursal;
	}



	public String getDireccionSucursal() {
		return direccionSucursal;
	}



	public void setDireccionSucursal(String direccionSucursal) {
		this.direccionSucursal = direccionSucursal;
	}



	public Comunas getComunas() {
		return Comunas;
	}



	public void setComunas(Comunas comunas) {
		Comunas = comunas;
	}
	
	
	
}
