package api.Modelo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name = "categorias")
public class Categorias {	
	
	
	    @Column(name = "idcategoria")
	    @Id
	    @SequenceGenerator(name = "Categoria_SEQ", sequenceName = "Categoria_SEQ", allocationSize = 1, initialValue=1)
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Categoria_SEQ")
	   
	    public int idCategoria;
	  
	    @Column(name = "nombrecategoria", nullable = false, length = 30)
	    public String nombreCategoria;

	    
	    
	    
	    
		public Categorias() {
			super();
		}

		public Categorias(int idCategoria, String nombreCategoria) {
			super();
			this.idCategoria = idCategoria;
			this.nombreCategoria = nombreCategoria;
		}

		public int getIdCategoria() {
			return idCategoria;
		}

		public void setIdCategoria(int idCategoria) {
			this.idCategoria = idCategoria;
		}

		public String getNombreCategoria() {
			return nombreCategoria;
		}

		public void setNombreCategoria(String nombreCategoria) {
			this.nombreCategoria = nombreCategoria;
		}
	  
	   
	   
}
