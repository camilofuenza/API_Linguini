package api.Modelo.Entities;


import javax.persistence.*;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="cartas")
public class Carta {


	
	@Column (name="idcarta", nullable=false)
	@Id
	@SequenceGenerator(name = "Carta_SEQ", sequenceName = "Carta_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Carta_SEQ")
	private int idCarta;
	
	@Column (name="nombrecarta", nullable=false)
	@Size(max=100)
	private String nombreCarta;
	
	
	@Column (name="valorcarta", nullable=false)
	private int valorCarta;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idcategoria")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Categorias categoria;
	 
	public Carta() {
		super();
	}
	
	

	public Carta(int idCarta, @Size(max = 100) String nombreCarta, int valorCarta, Categorias categoria) {
		super();
		this.idCarta = idCarta;
		this.nombreCarta = nombreCarta;
		this.valorCarta = valorCarta;
		this.categoria = categoria;
	}



	public int getIdCarta() {
		return idCarta;
	}

	public void setIdCarta(int idCarta) {
		this.idCarta = idCarta;
	}

	public String getNombreCarta() {
		return nombreCarta;
	}

	public void setNombreCarta(String nombreCarta) {
		this.nombreCarta = nombreCarta;
	}

	public int getValorCarta() {
		return valorCarta;
	}

	public void setValorCarta(int valorCarta) {
		this.valorCarta = valorCarta;
	}

	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}
	
	
	
	
	
}
