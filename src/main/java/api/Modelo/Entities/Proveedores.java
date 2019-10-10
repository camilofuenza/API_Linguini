package api.Modelo.Entities;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="proveedores")
public class Proveedores  {

	
	@Id
	@Column(name = "idproveedor", nullable = false)
	@SequenceGenerator(name = "Proveedor_SEQ", sequenceName = "Proveedor_SEQ", allocationSize = 1, initialValue=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Proveedor_SEQ")
	
	private int idProveedor;
	
	@Column(name = "rutproveedor", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	@Size(max=15)
	private String rutProveedor;

	@Column(name = "nombreproveedor", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	@Size(max=100)
	private String nombreProveedor;
	
	@Column(name = "direccionproveedor", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	@Size(max=100)
	private String direccionProveedor;
	
	@Column(name = "telefonoproveedor", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	@Size(max=14)
	private String telefonoProveedor;
	

	public Proveedores() {
		super();
	}

	

	public Proveedores(int idProveedor,
			@NotEmpty(message = "El campo no puede estar vacío") @Size(max = 15) String rutProveedor,
			@NotEmpty(message = "El campo no puede estar vacío") @Size(max = 100) String nombreProveedor,
			@NotEmpty(message = "El campo no puede estar vacío") @Size(max = 100) String direccionProveedor,
			@NotEmpty(message = "El campo no puede estar vacío") @Size(max = 14) String telefonoProveedor) {
		super();
		this.idProveedor = idProveedor;
		this.rutProveedor = rutProveedor;
		this.nombreProveedor = nombreProveedor;
		this.direccionProveedor = direccionProveedor;
		this.telefonoProveedor = telefonoProveedor;
	}



	public int getIdProveedor() {
		return idProveedor;
	}


	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}


	public String getRutProveedor() {
		return rutProveedor;
	}


	public void setRutProveedor(String rutProveedor) {
		this.rutProveedor = rutProveedor;
	}


	public String getNombreProveedor() {
		return nombreProveedor;
	}


	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}


	public String getDireccionProveedor() {
		return direccionProveedor;
	}


	public void setDireccionProveedor(String direccionProveedor) {
		this.direccionProveedor = direccionProveedor;
	}


	public String getTelefonoProveedor() {
		return telefonoProveedor;
	}


	public void setTelefonoProveedor(String telefonoProveedor) {
		this.telefonoProveedor = telefonoProveedor;
	}

	
	
	
	

}
