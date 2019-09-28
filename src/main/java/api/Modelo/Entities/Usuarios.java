package api.Modelo.Entities;

import javax.persistence.*;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="usuarios")
public class Usuarios {
	
	@Column (name="username", nullable=false)
	@Id	
	@Size(max=30)
	private String username;
	
	@Column (name="password", nullable=false)
	@Size(max=30)
	private String password;
	
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idrol")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Roles roles;

	public Usuarios() {
		super();
	}


	public Usuarios(@Size(max = 30) String username,
			 @Size(max = 30) String password, Roles roles) {
		super();
		this.username = username;
		this.password = password;
		this.roles = roles;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Roles getRoles() {
		return roles;
	}



	public void setRoles(Roles roles) {
		this.roles = roles;
	}
	

	
	
	
}
