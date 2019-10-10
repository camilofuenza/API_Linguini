package api.Modelo.Entities;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="inventarios")
public class Inventarios {

	
	@Id
	@Column(name = "idinventario", nullable = false)
	@SequenceGenerator(name = "Inventario_SEQ", sequenceName = "Inventario_SEQ", allocationSize = 1, initialValue=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Inventario_SEQ")
	private int idInventario;
	
	@Column(name = "stock", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	private int stock;


	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
	@JoinColumn(name = "idproducto")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Productos productos;
	
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE, orphanRemoval = true)
	@JoinColumn(name = "idbodega")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	
	private Bodegas bodegas;
	

	public Inventarios() {
		super();
	}

	

	public Inventarios(int idInventario, @NotEmpty(message = "El campo no puede estar vacío") int stock,
			Productos productos, Bodegas bodegas) {
		super();
		this.idInventario = idInventario;
		this.stock = stock;
		this.productos = productos;
		this.bodegas = bodegas;
	}



	public int getIdInventario() {
		return idInventario;
	}


	public void setIdInventario(int idInventario) {
		this.idInventario = idInventario;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public Productos getProductos() {
		return productos;
	}


	public void setProductos(Productos productos) {
		this.productos = productos;
	}


	public Bodegas getBodegas() {
		return bodegas;
	}


	public void setBodegas(Bodegas bodegas) {
		this.bodegas = bodegas;
	}
	
	
	
	

}
