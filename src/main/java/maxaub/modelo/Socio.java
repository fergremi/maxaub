package maxaub.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Socio
 */
@Entity
@Table(name="socio")
public class Socio implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="INT(11)", unique=true, nullable=false, precision=11)
	private long id;
	
	@Column(name="dni", columnDefinition="VARCHAR(9)", nullable=false, length=9)
	private String dni;
	
	@Column(name="nombre", columnDefinition="VARCHAR(16)", nullable=false, length=16)
	private String nombre;
	
	@Column(name="apellidos", columnDefinition="VARCHAR(25)", nullable=false, length=25)
	private String apellidos;
	
	@Column(name="email", columnDefinition="VARCHAR(50)", nullable=false, length=50)
	private String email;
	
	@Column(name="telefono", columnDefinition="INT(12)", nullable=false, precision=12)
	private long telefono;
	
	@Column(name="direccion", columnDefinition="VARCHAR(50)", nullable=false, length=50)
	private String direccion;
	
	@Column(name="contraseña", columnDefinition="VARCHAR(15)", nullable=false, length=15)
	private String contraseña;
	
	@Column(name="whatsapp", columnDefinition="TINYINT(1)", nullable=false, precision=1)
	private boolean whatsapp = false;
	
	@Column(name="activo", columnDefinition="TINYINT(1)", nullable=false, precision=1)
	private boolean activo = true;
	
	public Socio() {
		super();
	}
	
	public Socio(long id, String dni, String nombre, String apellidos, String email, long telefono, String direccion,
			String contraseña, boolean whatsapp, boolean activo) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
		this.contraseña = contraseña;
		this.whatsapp = whatsapp;
		this.activo = activo;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getDni() {
		return this.dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public long getTelefono() {
		return this.telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getContraseña() {
        return this.contraseña;
    }
	public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
	
	public boolean isWhatsapp() {
		return whatsapp;
	}
	public void setWhatsapp(boolean whatsapp) {
		this.whatsapp = whatsapp;
	}
	
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
}