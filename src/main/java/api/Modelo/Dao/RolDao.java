package api.Modelo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.Modelo.Entities.Roles;

@Repository
public interface RolDao extends JpaRepository<Roles,Integer> {

}
