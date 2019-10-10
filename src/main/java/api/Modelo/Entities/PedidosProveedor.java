package api.Modelo.Entities;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="pedidosproveedor")
public class PedidosProveedor {
	
	

	@Id
	@Column(name = "idpedidoproveedor", nullable = false)
	@SequenceGenerator(name = "PedidoProveedor_SEQ", sequenceName = "PedidoProveedor_SEQ", allocationSize = 1, initialValue=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="PedidoProveedor_SEQ")
	
	private int idPedidoProveedor;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE, orphanRemoval = true)
	@JoinColumn(name = "idempleado")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Empleados empleados;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE, orphanRemoval = true)
	@JoinColumn(name = "idtipopago")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private TipoPago tipoPago;
	
	@Column(name = "fechaemisionsolicitud", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	@JsonFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date fechaEmisionSolicitud;

	@Column(name = "fechaentregasolicitud", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	@JsonFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date fechaEntregaSolicitud;

	@Column(name = "totalpedidoproveedor", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	private int totalPedidoProveedor;

	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
	@JoinColumn(name = "idproveedor")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Proveedores proveedores;

	@Column(name = "ordencompra", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	private int ordenCompra;

	@Column(name = "idsolicitudpedido", nullable = false)
	@NotEmpty(message = "El campo no puede estar vacío")
	private int idSolicitudPedido;
	

	public PedidosProveedor() {
		super();
	}
	
	


	public PedidosProveedor(int idPedidoProveedor, Empleados empleados, TipoPago tipoPago,
			@NotEmpty(message = "El campo no puede estar vacío") Date fechaEmisionSolicitud,
			@NotEmpty(message = "El campo no puede estar vacío") Date fechaEntregaSolicitud,
			@NotEmpty(message = "El campo no puede estar vacío") int totalPedidoProveedor,
			Proveedores proveedores,
			@NotEmpty(message = "El campo no puede estar vacío") int ordenCompra,
			@NotEmpty(message = "El campo no puede estar vacío") int idSolicitudPedido) {
		super();
		this.idPedidoProveedor = idPedidoProveedor;
		this.empleados = empleados;
		this.tipoPago = tipoPago;
		this.fechaEmisionSolicitud = fechaEmisionSolicitud;
		this.fechaEntregaSolicitud = fechaEntregaSolicitud;
		this.totalPedidoProveedor = totalPedidoProveedor;
		this.proveedores = proveedores;
		this.ordenCompra = ordenCompra;
		this.idSolicitudPedido = idSolicitudPedido;
	}




	public int getIdPedidoProveedor() {
		return idPedidoProveedor;
	}


	public void setIdPedidoProveedor(int idPedidoProveedor) {
		this.idPedidoProveedor = idPedidoProveedor;
	}


	public Empleados getEmpleados() {
		return empleados;
	}


	public void setEmpleados(Empleados empleados) {
		this.empleados = empleados;
	}


	public TipoPago getTipoPago() {
		return tipoPago;
	}


	public void setTipoPago(TipoPago tipoPago) {
		this.tipoPago = tipoPago;
	}


	public Date getFechaEmisionSolicitud() {
		return fechaEmisionSolicitud;
	}


	public void setFechaEmisionSolicitud(Date fechaEmisionSolicitud) {
		this.fechaEmisionSolicitud = fechaEmisionSolicitud;
	}


	public Date getFechaEntregaSolicitud() {
		return fechaEntregaSolicitud;
	}


	public void setFechaEntregaSolicitud(Date fechaEntregaSolicitud) {
		this.fechaEntregaSolicitud = fechaEntregaSolicitud;
	}


	public int getTotalPedidoProveedor() {
		return totalPedidoProveedor;
	}


	public void setTotalPedidoProveedor(int totalPedidoProveedor) {
		this.totalPedidoProveedor = totalPedidoProveedor;
	}


	public Proveedores getProveedores() {
		return proveedores;
	}


	public void setProveedores(Proveedores proveedores) {
		this.proveedores = proveedores;
	}


	public int getOrdenCompra() {
		return ordenCompra;
	}


	public void setOrdenCompra(int ordenCompra) {
		this.ordenCompra = ordenCompra;
	}


	public int getIdSolicitudPedido() {
		return idSolicitudPedido;
	}


	public void setIdSolicitudPedido(int idSolicitudPedido) {
		this.idSolicitudPedido = idSolicitudPedido;
	}
	

	

}
