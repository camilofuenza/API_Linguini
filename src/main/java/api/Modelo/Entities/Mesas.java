package api.Modelo.Entities;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Max;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="mesas")
public class Mesas{
	
	
	
	@Id
	@Column (name="idmesa")
	@SequenceGenerator(name = "Mesa_SEQ", sequenceName = "Mesa_SEQ", allocationSize = 1,initialValue=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Mesa_SEQ")
	private int idMesa;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
	@JoinColumn(name = "idestado")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Estados estados;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
	@JoinColumn(name = "idempleado")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Empleados empleados;
	
	@Column(name="cantidadpersonas")
	private int cantidadPersonas;

	public Mesas() {
		super();
	}

	
	

	public Mesas(int idMesa, Estados estados, Empleados empleados, @Max(2) int cantidadPersonas) {
		super();
		this.idMesa = idMesa;
		this.estados = estados;
		this.empleados = empleados;
		this.cantidadPersonas = cantidadPersonas;
	}


	public int getIdMesa() {
		return idMesa;
	}


	public void setIdMesa(int idMesa) {
		this.idMesa = idMesa;
	}


	public Estados getEstados() {
		return estados;
	}


	public void setEstados(Estados estados) {
		this.estados = estados;
	}


	public Empleados getEmpleados() {
		return empleados;
	}


	public void setEmpleados(Empleados empleados) {
		this.empleados = empleados;
	}


	public int getCantidadPersonas() {
		return cantidadPersonas;
	}


	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}
	
	
	



	
	
}
