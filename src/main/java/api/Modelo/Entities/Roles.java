package api.Modelo.Entities;



import javax.persistence.*;

import javax.validation.constraints.Size;




@Entity
@Table(name="roles")
public class Roles{

	
	
	@Column(name="idrol")
	@Id
	@SequenceGenerator(name = "Rol_SEQ", sequenceName = "Rol_SEQ", allocationSize = 1, initialValue=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Rol_SEQ")
   
	private int idRol;
	
	@Column(name="nombrerol")
	@Size(max=30)
	private String nombreRol;
	
	

	
	public Roles(int idRol, @Size(max = 30) String nombreRol) {
		super();
		this.idRol = idRol;
		this.nombreRol = nombreRol;
	}

	public Roles() {
		super();
	}

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getNombreRol() {
		return nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}

	
	

	
}
