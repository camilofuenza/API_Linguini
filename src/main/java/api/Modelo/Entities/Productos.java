package api.Modelo.Entities;



import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="productos")
public class Productos {
	
	
	@Column(name = "idproducto")
	@Id
	@SequenceGenerator(name = "Producto_SEQ", sequenceName = "Producto_SEQ", allocationSize = 1, initialValue=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Producto_SEQ")
	
	private int idProducto;
	
	@Column(name = "nombreproducto", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	@Size(max=30)
	private String nombreProducto;
	
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
	@JoinColumn(name = "idcategoria")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Categorias categoria;

	public Productos() {
		super();
	}

	public Productos(int idProducto,
			@NotEmpty(message = "El campo no puede estar vacío") @Size(max = 30) String nombreProducto,
			Categorias categoria) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.categoria = categoria;
	}


	public int getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}


	public String getNombreProducto() {
		return nombreProducto;
	}


	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}


	public Categorias getCategoria() {
		return categoria;
	}


	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}
	
	

	

	


}
