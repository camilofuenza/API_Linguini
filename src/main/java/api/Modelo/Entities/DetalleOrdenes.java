package api.Modelo.Entities;

import javax.persistence.*;


@Entity
@Table(name = "detalleordenes")
public class DetalleOrdenes {

	@Column(name="iddetalleordenes")
	@Id
	
	@SequenceGenerator(name = "DetalleOrden_SEQ", sequenceName = "DetalleOrden_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="DetalleOrden_SEQ")
	private int iddetalleordenes;
	
	@ManyToOne
    @MapsId("idorden")
    @JoinColumn(name = "idorden")
    Ordenes ordenes;
	
	@ManyToOne
    @MapsId("idcarta")
    @JoinColumn(name = "idcarta")
    Carta cartas;
	

	
	public DetalleOrdenes() {
		super();
	}



	public DetalleOrdenes(Ordenes ordenes, Carta cartas) {
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



	public Carta getCartas() {
		return cartas;
	}



	public void setCartas(Carta cartas) {
		this.cartas = cartas;
	}



}
