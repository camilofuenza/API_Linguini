package api.Modelo.Entities;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="regiones")
public class Regiones {

	
	@Id
	@Column(name="idregion", nullable = false)
	@SequenceGenerator(name = "Region_SEQ", sequenceName = "Region_SEQ", allocationSize = 1, initialValue=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Region_SEQ")
	private int idRegion;
	
	@Column (name="nombreregion", nullable=false)
	@NotEmpty(message = "El campo no puede estar vacío")
	@Size(max=30)
	private String nombreRegion;

	public Regiones() {
		super();
	}
	
	public Regiones(int idRegion,
			@NotEmpty(message = "El campo no puede estar vacío") @Size(max = 30) String nombreRegion) {
		super();
		this.idRegion = idRegion;
		this.nombreRegion = nombreRegion;
	}

	public int getIdRegion() {
		return idRegion;
	}

	public void setIdRegion(int idRegion) {
		this.idRegion = idRegion;
	}

	public String getNombreRegion() {
		return nombreRegion;
	}

	public void setNombreRegion(String nombreRegion) {
		this.nombreRegion = nombreRegion;
	}
	
	

	

	

	

	
	
}
