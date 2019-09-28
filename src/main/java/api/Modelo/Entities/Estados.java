package api.Modelo.Entities;



import javax.persistence.*;

import javax.validation.constraints.Size;

@Entity
@Table(name="estados")
public class Estados{


	
	@Id
	@Column(name="idestado")
	@SequenceGenerator(name = "Estado_SEQ", sequenceName = "Estado_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Estado_SEQ")
	private int idEstado;
	
	@Column(name = "nombreestado", nullable = false)
	@Size(max=30)
	private String nombreEstado;
	
	public Estados() {
		super();
	}


	public Estados(int idEstado, String nombreEstado) {
		super();
		this.idEstado = idEstado;
		this.nombreEstado = nombreEstado;
	}

	public int getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}

	public String getNombreEstado() {
		return nombreEstado;
	}

	public void setNombreEstado(String nombreEstado) {
		this.nombreEstado = nombreEstado;
	}


}
