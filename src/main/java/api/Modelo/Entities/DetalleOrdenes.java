package api.Modelo.Entities;

import javax.persistence.*;


@Entity
@Table(name = "detalleordenes")
public class DetalleOrdenes {

	@Column(name="iddetalleordenes")
	@Id
	
	@SequenceGenerator(name = "DetalleOrden_SEQ", sequenceName = "DetalleOrden_SEQ", allocationSize = 1, initialValue=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="DetalleOrden_SEQ")
	private int iddetalleordenes;
	
	@ManyToOne (fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    @MapsId("idorden")
    @JoinColumn(name = "idorden")
    Ordenes ordenes;
	
	@ManyToOne (fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    @MapsId("idcarta")
    @JoinColumn(name = "idcarta")
    Cartas cartas;
	

	
	public DetalleOrdenes() {
		super();
	}



	public DetalleOrdenes(Ordenes ordenes, Cartas cartas) {
		super();
		this.ordenes = ordenes;
		this.cartas = cartas;
	}



	public Ordenes getOrdenes() {
		return ordenes;
	}



	public void setOrdenes(Ordenes ordenes) {
		this.ordenes = ordenes;
	}



	public Cartas getCartas() {
		return cartas;
	}



	public void setCartas(Cartas cartas) {
		this.cartas = cartas;
	}



}
