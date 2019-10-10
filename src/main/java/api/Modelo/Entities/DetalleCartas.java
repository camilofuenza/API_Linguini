package api.Modelo.Entities;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="detallecartas")
public class DetalleCartas {

	

	
	@Id
	@Column(name = "iddetallecarta", nullable = false)
	@SequenceGenerator(name = "DetalleCarta_SEQ", sequenceName = "DetalleCarta_SEQ", allocationSize = 1, initialValue=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="DetalleCarta_SEQ")
	private int idDetalleCarta;
	

	@ManyToOne (fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    @MapsId("idcarta")
    @JoinColumn(name = "idcarta")
    Cartas cartas;
	
	

	@ManyToOne (fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    @MapsId("idproducto")
    @JoinColumn(name = "idproducto")
    Productos productos;
	
	@Column(name = "cantidadproducto", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	private int cantidadProducto;

	public DetalleCartas() {
		super();
	}
	
	public DetalleCartas(int idDetalleCarta, Cartas cartas, Productos productos,
			@NotEmpty(message = "El campo no puede estar vacío") int cantidadProducto) {
		super();
		this.idDetalleCarta = idDetalleCarta;
		this.cartas = cartas;
		this.productos = productos;
		this.cantidadProducto = cantidadProducto;
	}

	public int getIdDetalleCarta() {
		return idDetalleCarta;
	}

	public void setIdDetalleCarta(int idDetalleCarta) {
		this.idDetalleCarta = idDetalleCarta;
	}

	public Cartas getCartas() {
		return cartas;
	}

	public void setCartas(Cartas cartas) {
		this.cartas = cartas;
	}

	public Productos getProductos() {
		return productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	
	

}
