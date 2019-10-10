package api.Modelo.Entities;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Table(name="comunas")
public class Comunas{
	
	
	@Id
	@SequenceGenerator(name = "Comuna_SEQ", sequenceName = "Comuna_SEQ", allocationSize = 1, initialValue=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Comuna_SEQ")
		private int idComuna;
	
	@Column(name = "nombrecomuna", nullable = false)
	@Size(max=50)
	@NotEmpty(message = "El campo no puede estar vacío")
	private String nombreComuna;
	
	
	@ManyToOne (fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    @MapsId("idciudad")
    @JoinColumn(name = "idciudad")
    private Ciudades ciudades;

	public Comunas() {
		super();
	}
	
	
	public Comunas(int idComuna, @Size(max = 50) @NotEmpty(message = "El campo no puede estar vacío") String nombreComuna,
			Ciudades ciudades) {
		super();
		this.idComuna = idComuna;
		this.nombreComuna = nombreComuna;
		this.ciudades = ciudades;
	}


	public int getIdComuna() {
		return idComuna;
	}


	public void setIdComuna(int idComuna) {
		this.idComuna = idComuna;
	}


	public String getNombreComuna() {
		return nombreComuna;
	}


	public void setNombreComuna(String nombreComuna) {
		this.nombreComuna = nombreComuna;
	}


	public Ciudades getCiudades() {
		return ciudades;
	}


	public void setCiudades(Ciudades ciudades) {
		this.ciudades = ciudades;
	}
	
	
	
	
	
	
}
