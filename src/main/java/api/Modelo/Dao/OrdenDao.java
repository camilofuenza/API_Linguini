package api.Modelo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import api.Modelo.Entities.Mesas;
import api.Modelo.Entities.Ordenes;

@Repository
public interface OrdenDao extends JpaRepository<Ordenes,Integer> {

	@Query("select o from Ordenes o where o.estados.nombreEstado= 'Pedido en lista'") 
	public List<Ordenes> listOrdenesenLista();
	

	@Query("select o from Ordenes o where o.estados.nombreEstado= 'Pedido en preparacion'") 
	public List<Ordenes> listOrdenesenPreparacion();
	

	@Query("select o from Ordenes o where o.estados.nombreEstado= 'Pedido listo'") 

		public List<Ordenes> listOrdenesTerminadas();
	}

