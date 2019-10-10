package api.Modelo.Entities;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Table(name="ciudades")
public class Ciudades {


	@Id
	@Column(name="idCiudad", nullable = false)
	@SequenceGenerator(name = "Ciudad_SEQ", sequenceName = "Ciudad_SEQ", allocationSize = 1, initialValue=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Ciudad_SEQ")
	private int idCiudad;
	
	@Column(name="nombreciudad", nullable = false)
	@Size(max=100)
	@NotEmpty(message = "El campo no puede estar vacío")
	private String nombreCiudad;
	
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE, orphanRemoval = true)
	@JoinColumn(name = "idregion")
	@NotEmpty(message = "El campo no puede estar vacío")
	private Regiones regiones;

	
	public Ciudades() {
		super();
	}

	public Ciudades(int idCiudad,
			@Size(max = 100) @NotEmpty(message = "El campo no puede estar vacío") String nombreCiudad,
			@NotEmpty(message = "El campo no puede estar vacío") Regiones regiones) {
		super();
		this.idCiudad = idCiudad;
		this.nombreCiudad = nombreCiudad;
		this.regiones = regiones;
	}


	public int getIdCiudad() {
		return idCiudad;
	}


	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}


	public String getNombreCiudad() {
		return nombreCiudad;
	}


	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}


	public Regiones getRegiones() {
		return regiones;
	}


	public void setRegiones(Regiones regiones) {
		this.regiones = regiones;
	}
	
	
	
}
