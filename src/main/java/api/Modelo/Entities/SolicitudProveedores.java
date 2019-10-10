package api.Modelo.Entities;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="solicitudproveedores")
public class SolicitudProveedores {

	/**
	 * 
	 */

	@Id
	@Column(name = "idsolicitudproveedor", nullable = false)
	@SequenceGenerator(name = "SolicitudProveedor_SEQ", sequenceName = "SolicitudProveedor_SEQ", allocationSize = 1, initialValue=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="SolicitudProveedor_SEQ")
   
	private int idSolicitudProveedor;
	
	@Column(name = "ordencompra", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	private int ordenCompra;

	@Column(name = "cantidadsolicitud", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	private int cantidadSolicitud;
	
	@Column(name = "valordetallesolicitud", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	private int valorDetalleSolicitud;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
	@JoinColumn(name = "idproducto")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Productos productos;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
	@JoinColumn(name = "idproveedor")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Proveedores proveedores;

	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
	@JoinColumn(name = "idempleado")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Empleados empleados;

	

	public SolicitudProveedores() {
		super();
	}

	


	public SolicitudProveedores(int idSolicitudProveedor,
			@NotEmpty(message = "El campo no puede estar vacío") int ordenCompra,
			@NotEmpty(message = "El campo no puede estar vacío") int cantidadSolicitud,
			@NotEmpty(message = "El campo no puede estar vacío") int valorDetalleSolicitud, Productos productos,
			Proveedores proveedores, Empleados empleados) {
		super();
		this.idSolicitudProveedor = idSolicitudProveedor;
		this.ordenCompra = ordenCompra;
		this.cantidadSolicitud = cantidadSolicitud;
		this.valorDetalleSolicitud = valorDetalleSolicitud;
		this.productos = productos;
		this.proveedores = proveedores;
		this.empleados = empleados;
	}




	public int getIdSolicitudProveedor() {
		return idSolicitudProveedor;
	}



	public void setIdSolicitudProveedor(int idSolicitudProveedor) {
		this.idSolicitudProveedor = idSolicitudProveedor;
	}



	public int getOrdenCompra() {
		return ordenCompra;
	}



	public void setOrdenCompra(int ordenCompra) {
		this.ordenCompra = ordenCompra;
	}



	public int getCantidadSolicitud() {
		return cantidadSolicitud;
	}



	public void setCantidadSolicitud(int cantidadSolicitud) {
		this.cantidadSolicitud = cantidadSolicitud;
	}



	public int getValorDetalleSolicitud() {
		return valorDetalleSolicitud;
	}



	public void setValorDetalleSolicitud(int valorDetalleSolicitud) {
		this.valorDetalleSolicitud = valorDetalleSolicitud;
	}



	public Productos getProductos() {
		return productos;
	}



	public void setProductos(Productos productos) {
		this.productos = productos;
	}



	public Proveedores getProveedores() {
		return proveedores;
	}



	public void setProveedores(Proveedores proveedores) {
		this.proveedores = proveedores;
	}



	public Empleados getEmpleados() {
		return empleados;
	}



	public void setEmpleados(Empleados empleados) {
		this.empleados = empleados;
	}

	
	
	

	
}
