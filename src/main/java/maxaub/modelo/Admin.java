package maxaub.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Admin
 */
@Entity
@Table(name="admin")
public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="NUMBER(11)", unique=true, nullable=false, precision=19)
	private long id;
	
	@Column(name="usuario", columnDefinition="VARCHAR(15)", nullable=false, length=15)
	private String usuario;
	
	@Column(name="contraseña", columnDefinition="VARCHAR(15)", nullable=false, length=15)
	private String contraseña;
	
	public Admin() {
		super();
	}
	
	public Admin(String usuario, String contraseña) {
		super();
       this.usuario = usuario;
       this.contraseña = contraseña;
    }
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getUsuario() {
		return this.usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getContraseña() {
        return this.contraseña;
    }
	public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}